package lab6.ex7;

public class Pair<E> {
    private final E firstElement;
    private final E secondElement;

    public E getFirstElement() {
        return firstElement;
    }

    public E getSecondElement() {
        return secondElement;
    }

    public Pair(E firstElement, E secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstElement=" + firstElement +
                ", secondElement=" + secondElement +
                '}';
    }
}
