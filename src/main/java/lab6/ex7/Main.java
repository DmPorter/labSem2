package lab6.ex7;

public class Main {
    public static void main(String[] args) {
        PairComp<Integer> pairComp = new PairComp<>(1, 2);

        System.out.println("Max: " + pairComp.max());
        System.out.println("Min: " + pairComp.min());
    }
}
