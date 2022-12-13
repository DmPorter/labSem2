package lab6.ex25;

import lab6.ex1.Stack;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

public class Tests {

    public static <T extends Closeable, V extends Closeable> void close(T one, V two, Integer j){
        try {
            one.close();
            two.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static  <T extends Closeable, V extends Closeable> void close(T one, V two){
        try {
            one.close();
            two.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static <T> T returnValue(T value){
        return value;
    }
    public static void returnValue(List<?> list){
        list.size();
    }

    public static void test(Stack<?> stack){

    }

}
