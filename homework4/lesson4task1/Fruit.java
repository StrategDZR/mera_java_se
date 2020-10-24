package lesson4task1;

import java.util.Random;

public abstract class Fruit {
    private int weight;

    public Fruit() {
        this.weight = new Random().nextInt(100);
    }

    public int getWeight() {
        return weight;
    }

    public abstract String toString();
}
