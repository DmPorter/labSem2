package lab6.ex5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Number[] result = swap(0, 1, 1.5, 2, 3); // определяет их как Number
        //Double[] result1 = swap(0, 1, 1.5, 2.0, 3.0); // явно используем Double
        Double[] result2 = swap(0, 1, 1.0, 2.0, 3.0); // делаем каст к double, что не получится
        //System.out.println(Arrays.toString(result1));
    }

    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }



}
