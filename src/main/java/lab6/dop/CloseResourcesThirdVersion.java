package lab6.dop;

import lab6.dop.sources.ClassExc1;
import lab6.dop.sources.ClassExc2;
import lab6.dop.sources.ClassOk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CloseResourcesThirdVersion {
    public static void main(String[] args) {
        ClassExc1 classExc1 = new ClassExc1();
        ClassExc2 classExc2 = new ClassExc2();
        ClassOk classOk = new ClassOk();
        PrintWriter printWriter = new PrintWriter(System.out);
        try {
            FileReader fileReader = new FileReader("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\files\\Three1.txt");

            List<MyCloseable<IOException>> list = new ArrayList<>();
            list.add(classExc2::close);
            list.add(classExc1::close);
            list.add(classOk::close);
            list.add(fileReader::close);

            try {
                closeAll(list);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        MyCloseable<IOException> close1 = classExc1::close;
        MyCloseable<IOException> close2 = classExc2::close;
        MyCloseable<IOException> close3 = classOk::close;

//        List<AutoCloseable> autoCloseables = new ArrayList<>();
//        autoCloseables.add(classExc1);
//        autoCloseables.add(classExc2);
//        autoCloseables.add(classOk);



//        try {
//            closeAll(CloseResourcesThirdVersion.<IOException>closeableToMyCloseable(autoCloseables));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


//    public static <E extends Exception> List<MyCloseable<E>> closeableToMyCloseable(List<AutoCloseable> list){
//        List<MyCloseable<E>> newList = new ArrayList<>();
//        for(AutoCloseable val: list){
//            newList.add(val::close);
//        }
//        return newList;
//    }
    public static <T extends MyCloseable<E>, E extends Exception> void closeAll(List<T> list) throws E{
        E fullException = null;

        for(MyCloseable<E> val: list){
            try{
                val.close();
            }catch (Exception e){
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
