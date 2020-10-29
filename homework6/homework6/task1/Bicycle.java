package homework6.task1;

import java.util.Random;

public class Bicycle {
    private String modelName;
    private int maxSpeed;
    private static final int MAX_SPEED = 50;
    private static final int MIN_SPEED = 5;

    public Bicycle() {
        this.modelName = getRandomModelName();
        this.maxSpeed = new Random().nextInt((MAX_SPEED - MIN_SPEED) + 1) + MIN_SPEED;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private String getRandomModelName(){
        String[] names = new String[]{"Merida", "Stels", "Avalon", "Aist"};
        int rnd = new Random().nextInt(names.length);
        return names[rnd];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bicycle bicycle = (Bicycle) o;

        if (maxSpeed != bicycle.maxSpeed) return false;
        return modelName.equals(bicycle.modelName);
    }

    @Override
    public int hashCode() {
        int result = modelName.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }

    public String getInfo() {
        return "Bike " + getModelName()
                + " with max speed = "
                + getMaxSpeed() + " km/h";
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
