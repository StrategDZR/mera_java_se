package lesson4task1;

import java.util.Random;

public class Pineapple extends Fruit {
    private int heightOfTail;

    public Pineapple() {
        this.heightOfTail = new Random().nextInt(20 - 5) + 5;
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