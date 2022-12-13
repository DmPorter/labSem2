package lab7.ex3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> grp1 = new HashSet<Integer>();

        grp1.add(1);
        grp1.add(2);
        grp1.add(3);
        grp1.add(4);
        grp1.add(5);

        System.out.println("1. collection: ");
        for (int numbers : grp1) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        Set<Integer> grp2 = new HashSet<Integer>();

        grp2.add(8);
        grp2.add(7);
        grp2.add(6);
        grp2.add(5);
        grp2.add(4);

        System.out.println("2. collection: ");
        for (int numbers : grp2) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        Set<Integer> union = new HashSet<>(grp1);
        union.addAll(grp2);

        System.out.println("union " + union);


        Set<Integer> intersection = new HashSet<>(grp1);
        intersection.retainAll(grp2);

        System.out.println("INTER " + intersection);

        Set<Integer> diff = new HashSet<>(grp1);
        diff.removeAll(grp2);

        System.out.println("DIFF " + diff);
    }
}
