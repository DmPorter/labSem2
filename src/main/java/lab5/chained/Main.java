package lab5.chained;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ex1();
        //ex2();
    }

    public static void ex1() throws IOException {
        int a = 2;
        int b = 0;

        try {
            int c = a / b;
        }catch (ArithmeticException e){
            throw new IOException("0", e);
        }
    }

    public static void ex2() {
        try {
            FileReader fileReader = new FileReader("asdasd");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
