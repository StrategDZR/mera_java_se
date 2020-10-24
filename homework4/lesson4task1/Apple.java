package lesson4task1;

import java.util.Random;

public class Apple extends Fruit {
    private String color;

    public Apple() {
        String[] possibleColors = new String[]{"Red", "Green", "Yellow"};
        int rndIndex = new Random().nextInt(possibleColors.length);
        this.color = possibleColors[rndIndex];
    }

    // for Task2
    public Apple(String color){
        switch (color){
            case "Red":
                this.color = "Red";
                break;
            case "Green":
                this.color = "Green";
                break;
            case "Yellow":
                this.color = "Yellow";
                break;
            default:
                System.out.println("Pick correct color");
                break;
        }
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Type of fruit: " + getClass().getName().replace("lesson4task1.", "") +
                "; Color: " + getColor() + "; Weight: " + super.getWeight();
    }
}