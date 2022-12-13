package lab6.ex1;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    List<E> arr;

    public Stack() {
        this.arr = new ArrayList<>();
    }

    public void push(E element){
        arr.add(0, element);
    }

    public E pop(){
        return arr.remove(0);
    }

    public boolean isEmpty(){
        return arr.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + arr +
                '}';
    }
}
