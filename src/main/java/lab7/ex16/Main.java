package lab7.ex16;

import lab7.ex13.Cache;

public class Main {
    public static void main(String[] args) {
        ImmutableCustomList<Integer> integers = new ImmutableCustomList<>(number -> number, 5);
        for (int i = 0; i < 10; i++) {
            System.out.println(integers.get(i));
        }
        ImmutableCustomList<String> strings = new ImmutableCustomList<>(number -> "It is string #" + number, 5);
        for (int i = 0; i < 10; i++) {
            System.out.println(strings.get(i));
        }
        System.out.println(integers.getCache());
        System.out.println(strings.getCache());
    }
}
