package lab7.ex14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        List<Integer> list = getView(4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            System.out.println(val);
        }
        System.out.println(list.get(4));

        list.add(5);
    }

    private static List<Integer> getView(int n) {
        List<Integer> integerList = new ListNumbers(n);
        return Collections.unmodifiableList(integerList);
    }
}
