package lab5.ex10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(factorialWithExceptions(4));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static int factorialWithExceptions(int number) {
        if (number == 1) {
            throw new RuntimeException("1");
        }
        int result;
        try {
            result = factorialWithExceptions(number - 1) * number;
        } catch (RuntimeException e) {
            throw new RuntimeException(Integer.toString(Integer.parseInt(e.getMessage()) * number), e);
        }
        return result;
    }



}
