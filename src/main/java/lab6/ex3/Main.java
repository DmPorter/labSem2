package lab6.ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();
        table.addEntry(new Entry<>(1, "1"));
        table.addEntry(new Entry<>(1, "1"));
        table.addEntry(new Entry<>(2, "2"));
        table.addEntry(new Entry<>(3, "3"));
        table.addEntry(new Entry<>(4, "4"));



        System.out.println(table.getValue(1).getClass());
        System.out.println(table);

        table.addEntry(new Entry<>(4, "45"));

        System.out.println(table);

        System.out.println("Remove " + table.removeEntry(1));

        System.out.println();
        System.out.println(table);

        Table<Integer, String> tableNew = Table.asTable(new Entry<>(1, "1"), new Entry<>(2, "2"), new Entry<>(3, "3"), new Entry<>(4, "4"));

        System.out.println(tableNew);

    }
}
