package lesson4task1;

import java.util.Random;
import static java.lang.Integer.MAX_VALUE;

public class Pineapple extends Fruit {
    private int heightOfTail;

    public Pineapple() {
        this.heightOfTail = new Random().nextInt(20 - 5) + 5;
    }

    // for Task2
    public Pineapple(int minHeightOfTail) {
        this.heightOfTail = new Random().nextInt(MAX_VALUE - minHeightOfTail) + minHeightOfTail;
    }

    public int getHeightOfTail() {
        return heightOfTail;
    }

    @Override
    public String toString() {
        return "Type of fruit: " + getClass().getName().replace("lesson4task1.", "")
                + "; Height of tail: " + getHeightOfTail() + "; Weight:" + super.getWeight();
    }
}