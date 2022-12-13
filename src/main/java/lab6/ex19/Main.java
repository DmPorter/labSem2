package lab6.ex19;

import java.util.ArrayList;
import java.util.Arrays;

//������� ����� � ������� newInstance
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = repeat(10, 10);
        list.toArray(); // ���������� getClass() ������
        System.out.println(Arrays.toString(toArray(list))); //��������, �� ������������ getClass()
        System.out.println(Arrays.toString(toArrayWithoutList(10, 11)));
        System.out.println();
    }

    public static <T> ArrayList<T> repeat(int n, T obj) {
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            result.add(obj);
        return result;
    }

    public static <T> T[] toArray(ArrayList<T> list){
        T[] arr = (T[]) list.toArray();
        return arr;
    }

    public static <T> T[] toArrayWithoutList(int j, T obj){
        Object[] objects = new Object[j];
        for(int i = 0; i < j; i++){
            objects[i] = obj;
        }
        return (T[]) objects;
    }
}
