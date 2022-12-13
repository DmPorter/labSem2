package lab6.ex21;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String>[] result = construct(10);
        System.out.println(Arrays.toString(result));
    }
    @SafeVarargs
    static <T> T[] construct(int size, T... template) {
        return Arrays.copyOf(template, size);
    }
}
