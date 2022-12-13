package lab6.examples;

import lab6.ex3.Entry;

import java.util.Arrays;

public class Reflect {
    public static void main(String[] args) {
        Entry<Integer, Integer> test = new Entry<>(100, 100);

        System.out.println(Arrays.toString(test.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(test.getClass().getTypeParameters()));

    }
}
