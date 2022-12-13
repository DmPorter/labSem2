package lab7.ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (Integer data : list) {
            if (data.equals(4)) {
                list.remove(data);
            }
        }

        list.removeIf(a -> a == 4);
        System.out.println(list);
        list.add(4);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals(4)) iterator.remove();
        }
        System.out.println(list);
    }
}
