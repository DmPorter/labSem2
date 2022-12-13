package lab7.dop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        String str = "a";
        for(int i = 0; i < 5; i ++){
            arrayList1.add(str);
            str += str;
        }

        System.out.println(arrayList1);

        List<Integer> arrayList2 = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            arrayList2.add(i);
        }

        System.out.println(arrayList2);

        System.out.println("result: " + joinMany(arrayList1, arrayList2, String::length, a -> a*2,
                                                                            (a, b) -> a.length()*b));

        List<Integer> linkedList1 = new LinkedList<>();

        for(int i = 1; i <= 5; i++){
            linkedList1.add(i);
        }

        System.out.println(linkedList1);

        List<Integer> linkedList2 = new LinkedList<>();

        for(int i = 100; i > 0; i--){
            linkedList2.add(i);
        }

        System.out.println(linkedList2);

        System.out.println("result: " + joinMany(linkedList1, linkedList2, a -> a*a, a -> a,
                (a, b) -> "" + (a*a) + " " + b));
    }

    public static <T1, T2, T3, F1, F2> List<T3> joinMany(List<T1> t1List,
                                                         List<T2> t2List,
                                                         Function<T1, F1> function1,
                                                         Function<T2, F2> function2,
                                                         BiFunction<T1, T2, T3> biFunction){
        List<T3> list = new ArrayList<>();
        for(T1 valueT1: t1List){
            for(T2 valueT2: t2List){
                if(function1.apply(valueT1).equals(function2.apply(valueT2))) {
                    list.add(biFunction.apply(valueT1, valueT2));
                }
            }
        }
        return list;
    }
}
