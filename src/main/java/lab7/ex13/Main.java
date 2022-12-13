package lab7.ex13;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<>(5);
        for (int i = 0; i < 10; i++) {
            cache.put(i, "SomeValue");
        }
        System.out.println(cache);
    }
}
