package lab6.ex7;

public class PairComp<E extends Comparable<? super E>> {
    private final E firstElement;
    private final E secondElement;

    public PairComp(E firstElement, E secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public E getFirstElement() {
        return firstElement;
    }

    public E getSecondElement() {
        return secondElement;
    }

    public E max(){
        int val = firstElement.compareTo(secondElement);
        if(val >= 0) return firstElement;
        else return secondElement;
    }

    public E min(){
        int val = firstElement.compareTo(secondElement);
        if(val >= 0) return secondElement;
        else return firstElement;
    }


    @Override
    public String toString() {
        return "PairComp{" +
                "firstElement=" + firstElement +
                ", secondElement=" + secondElement +
                '}';
    }
}
