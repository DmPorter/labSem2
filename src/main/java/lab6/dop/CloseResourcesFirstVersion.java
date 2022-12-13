package lab6.dop;


import lab6.dop.sources.ClassExc1;
import lab6.dop.sources.ClassExc2;
import lab6.dop.sources.ClassOk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CloseResourcesFirstVersion {

    public static void main(String[] args) {
        List<AutoCloseable> list = new ArrayList<>();
        list.add(new ClassOk());
        list.add(new ClassExc1());
        list.add(new ClassOk());
        list.add(new ClassExc1());
        list.add(new ClassExc2());
        list.add(new ClassExc2());
        list.add(new ClassExc1());


        List<ClassExc2> classExc2List = new ArrayList<>();
        classExc2List.add(new ClassExc2());
        classExc2List.add(new ClassExc2());
        classExc2List.add(new ClassExc2());

        try {
            CloseResourcesFirstVersion.<IOException>closeAll(classExc2List);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public static <E extends Exception> void closeAll(List<? extends AutoCloseable> list) throws E {
        CloseResourcesFirstVersion.<AutoCloseable, E>closeAllHelper((List<AutoCloseable>) list);
    }
    @SuppressWarnings("unchecked")
    public static <T extends AutoCloseable, E extends Exception> void closeAllHelper(List<T> list) throws E {
        E fullException = null;
        for(T value: list){
            try {
                value.close();
            } catch (Exception e) {
                if(fullException == null){
                    fullException = (E) e;
                }else{
                    fullException.addSuppressed(e);
                }
            }
        }
        if(fullException != null) throw fullException;
    }
}
