package lab6.ex3;

public class Entry<K, V>{
    private final K key;
    private final V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" + key +
                "=" + (value.getClass() == String.class ? ("\"" + value + "\"") : value) +
                '}';
    }
}
