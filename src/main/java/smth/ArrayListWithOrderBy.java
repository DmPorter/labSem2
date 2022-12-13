package smth;

import java.util.*;

public class ArrayListWithOrderBy<T> implements List<T> {
    ArrayList<T> list;
    List<Comparator<T>> comparators;

    public ArrayListWithOrderBy(){
        this.list = new ArrayList<>();
        this.comparators = new ArrayList<>();
    }

    private void sortArrayList(){
        for(int i = comparators.size() - 1; i >= 0; i--) {
            list.sort(comparators.get(i));
        }
    }

    @SafeVarargs
    public final void orderBy(Comparator<T>... comparators){
        this.comparators = new ArrayList<>(List.of(comparators));
        sortArrayList();
    }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(T t) {
        boolean flag = list.add(t);
        sortArrayList();
        return flag;
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean flag = list.addAll(c);
        sortArrayList();
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        boolean flag = list.addAll(index, c);
        sortArrayList();
        return flag;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = list.removeAll(c);
        sortArrayList();
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean flag = list.retainAll(c);
        sortArrayList();
        return flag;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T set(int index, T element) {
        T elementNew = list.set(index, element);
        sortArrayList();
        return elementNew;
    }

    @Override
    public void add(int index, T element) {
        list.add(index, element);
        sortArrayList();
    }

    @Override
    public T remove(int index) {
        T element = list.remove(index);
        sortArrayList();
        return element;
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return size() - 1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
