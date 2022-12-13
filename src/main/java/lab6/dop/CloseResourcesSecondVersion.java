package lab6.dop;

import lab6.dop.sources.ClassExc1;
import lab6.dop.sources.ClassExc2;
import lab6.dop.sources.ClassOk;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class CloseResourcesSecondVersion {
    public static void main(String[] args) {
        List<AutoCloseable> list = new ArrayList<>();
        list.add(new ClassOk());
        list.add(new ClassExc2());
        list.add(new ClassExc1());
        closeAll(list);
    }


    public static <T extends AutoCloseable, E extends Exception>
    void closeAll(List<T> list) throws E {
        ArrayList<Class<?>> excList = new ArrayList<>();
        try {
            for(T val: list){
                excList.addAll(Arrays.stream(val.getClass().getMethod("close").getExceptionTypes()).filter(cl -> cl != Exception.class).toList());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Class<?> typeException;

        if (checkTypeSameException(excList)){
            typeException = excList.get(0);
        }else{
            typeException = getTypeException(excList);
        }

        E exc = null;
        try {
            exc = (E) typeException.getConstructor().newInstance();
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("type: " + typeException);
        System.out.println("class exc: " + exc.getClass());

        E fullException = null;
        for(T value: list){
            try {
                value.close();
            } catch (Exception e) {
                if(fullException == null){
                    //fullException = typeException.cast(e);
                }else {
                    fullException.addSuppressed(e);
                }

            }
        }
        if(fullException != null) throw fullException;


    }

    private static boolean checkTypeSameException(ArrayList<Class<?>> excList){
        Class<?> firstExc = excList.get(0);

        for(int i = 1; i < excList.size(); i++){
            if(firstExc != excList.get(i)) return false;
        }
        return true;
    }

    private static Class<?> getTypeException(ArrayList<Class<?>> excList){
        HashMap<Class<?>, Integer> excMap = new HashMap<>();
        for(Class<?> val: excList){
            while(val != Exception.class){
                if(excMap.containsKey(val)){
                    excMap.put(val, excMap.get(val) + 1);
                }else{
                    excMap.put(val, 1);
                }
                val =  val.getSuperclass();
            }
        }

        for(Map.Entry<Class<?>, Integer> val: excMap.entrySet()){
            if(excList.size() == val.getValue()) return val.getKey();
        }
        return Exception.class;
    }
}
