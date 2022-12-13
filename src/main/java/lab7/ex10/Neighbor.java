package lab7.ex10;

import java.util.Comparator;

public class Neighbor implements Comparator<Neighbor> {
    private String name;
    private int cost;

    public Neighbor() {
    }

    public Neighbor(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Neighbor setName(String name) {
        this.name = name;
        return this;
    }

    public Neighbor setCost(int cost) {
        this.cost = cost;
        return this;
    }

    @Override
    public int compare(Neighbor neighbor1, Neighbor neighbor2) {
        return neighbor1.cost - neighbor2.cost;
    }
}
