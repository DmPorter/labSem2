package lab6.ex9;

import lab6.ex7.Pair;
import lab6.ex7.PairComp;

import java.util.ArrayList;

public class ArraysFunc {


    public static <E> Pair<E> firstLast(ArrayList<? extends E> a){
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }

    public static <E extends Comparable<? super E>> E min(ArrayList<E> arr){
        E min = arr.get(0);
        for(E val: arr){
            if(min.compareTo(val) > 0) min = val;
        }
        return min;
    }


    public static <E extends Comparable<? super E>> E max(ArrayList<E> arr){
        E max = arr.get(0);
        for(E val: arr){
            if(max.compareTo(val) < 0) max = val;
        }
        return max;
    }

    public static <E extends Comparable<? super E>> PairComp<E> minMax(ArrayList<E> arr){
        return new PairComp<>(min(arr), max(arr));
    }
}
