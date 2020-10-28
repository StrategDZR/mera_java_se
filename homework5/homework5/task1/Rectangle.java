package homework5.task1;

import java.util.Random;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle() {
        super();
        this.height = new Random().nextInt(20);
        this.width = new Random().nextInt(20);
    }

    @Override
    public void square() {
        int s = (height * width);
        System.out.println("Rectangle - " + s);
    }
}
