package lab6.ex9;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(){{
            add(2);
            add(-10);
            add(1);
            add(10);
        }};

        System.out.println(ArraysFunc.firstLast(arr));
        System.out.println(ArraysFunc.min(arr));
        System.out.println(ArraysFunc.max(arr));
        System.out.println(ArraysFunc.minMax(arr));

    }


}
