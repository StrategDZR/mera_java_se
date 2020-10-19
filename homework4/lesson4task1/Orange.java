package lesson4task1;

import java.util.Random;

public class Orange extends Fruit {
    private int thickness;

    public Orange() {
        this.thickness = new Random().nextInt(20);
    }

    public int getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return "Type of fruit: " + getClass().getName().replace("lesson4task1.", "")
                + "; Thickness: " + getThickness() + "; Weight: " +  super.getWeight();
    }
}