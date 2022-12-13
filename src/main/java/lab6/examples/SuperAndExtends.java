package lab6.examples;

import java.util.*;

public class SuperAndExtends {

    public static void main(String[] args) {
        Comparator<Number> comparator = Comparator.comparingDouble(Number::doubleValue);

        System.out.println(compare(2.5, 2.2, comparator));
        System.out.println(compare(2.5, 2.2, Double::compareTo));
        System.out.println(compare(2, 2, comparator));

        List<Number> numberList = new ArrayList<>();
        numberList.add(2.0);

        System.out.println(addNewElement(numberList, 5.0));


        System.out.println(getMaxElement(numberList, comparator));
    }

    public static <T extends Number> int compare(T elem1, T elem2, Comparator<? super T> comparator){
        return comparator.compare(elem1, elem2);
    }

    public static <T extends Number> T getMaxElement(List<T> numbers, Comparator<? super T> comparator){
        return numbers.stream().max(comparator).orElse(null);
    }

    public static <T extends Number> T getElementByIndex(List<T> numbers, int index){
        return numbers.get(index);
    }

    public static List<?> addNewElement(List<? super Number> list, Number number){
        list.add(number);
        return list;
    }





}
