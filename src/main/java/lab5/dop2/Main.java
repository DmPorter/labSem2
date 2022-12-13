package lab5.dop2;

import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(exmplReturn());
        exmplEx();
    }

    public static void exmplEx() throws RuntimeException{
        try{
            throw new RuntimeException("Hello");
        }finally {
            Objects.requireNonNull(null);
        }
    }

    public static int exmplReturn(){
        try {
            System.out.println("try");
            return 1;
        }
        finally {
            System.out.println("finally");
            return 2;
        }
    }
}
