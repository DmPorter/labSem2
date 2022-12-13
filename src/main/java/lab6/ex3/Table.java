package lab6.ex3;


import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {
    List<Entry<K, V>> arr;

    public Table() {
        this.arr = new ArrayList<>();
    }


    public V getValue(K key){
        for(Entry<K, V> value: arr){
            if(value.getKey() == key){
                return value.getValue();
            }
        }
        return null;
    }

    public Entry<K, V> removeEntry(K key){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getKey() == key){
                return arr.remove(i);
            }
        }
        return null;
    }


    public void addEntry(Entry<K, V> value){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getKey() == value.getKey()){
               arr.remove(i);
               arr.add(i, value);
               return;
            }
        }
        arr.add(value);
    }


    @SafeVarargs
    public static <T, E> Table<T, E> asTable(Entry<T, E>... values){
        Table<T, E> table = new Table<>();
        for(Entry<T, E> value: values){
            table.addEntry(value);
        }
        return table;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(var value: arr){
            stringBuilder.append(value.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
