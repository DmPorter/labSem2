package lab7.ex17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

/*
    @SuppressWarnings("unchecked")
    E typeCheck(Object o) {
        if (o != null && !type.isInstance(o))
            throw new ClassCastException(badElementMsg(o));
        return (E) o;
    }

    private String badElementMsg(Object o) {
        return "Attempt to insert " + o.getClass() +
                " element into collection with element type " + type;
    }
*/

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);
        integers.add(10);


        List<Double> listOfString = new LinkedList<>();
        listOfString.add(10.2);
        List<Integer> listOfInteger
                = (List<Integer>)(Object)listOfString;
        listOfInteger.add(2);
        listOfInteger.add(3);

        List<Integer> list = listOfInteger.subList(0, 2);

        System.out.println(list);

        List<Integer> checkArray = Collections.checkedList(listOfInteger, Integer.class);

        try {
            checkArray.addAll(0, checkArray.subList(0,1));
        }catch (ClassCastException e){
            e.printStackTrace();
        }


    }
}
