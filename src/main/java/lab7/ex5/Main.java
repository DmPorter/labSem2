package lab7.ex5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int indexFrom = 0;
        int fromTo = 9;

        List<Integer> integersArr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integersArr.add(i);
        }
        System.out.println(integersArr);
        swap(integersArr, indexFrom, fromTo);
        System.out.println(integersArr);

        List<Integer> integersLink = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integersLink.add(i);
        }
        System.out.println(integersLink);
        swap(integersLink, indexFrom, fromTo);
        System.out.println(integersLink);
    }

    public static void swap(List<?> list, int i, int j) {
        swapHelp(list, i, j);
    }

    private static <T> void swapHelp(List<T> list, int i, int j) {
        if (list instanceof RandomAccess) {
            T o = list.get(i);
            list.set(i, list.get(j));
            list.set(j, o);
        } else {
            ListIterator<T> iteratorI = list.listIterator(i);
            ListIterator<T> iteratorJ = list.listIterator(j);
            T o = iteratorI.next();
            iteratorI.previous();
            iteratorI.set(iteratorJ.next());
            iteratorJ.previous();
            iteratorJ.set(o);
        }
    }
}
