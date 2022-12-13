package lab7.ex6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Set<String>> treeMapSet = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            Set<String> stringSet = new TreeSet<>();
            stringSet.add("ASDASDASD");
            treeMapSet.put(i + "tree->", stringSet);
        }

        System.out.println(treeMapSet);

    }
}
