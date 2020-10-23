package lesson4task2;

import lesson4task1.Fruit;

public abstract class AbstractFabric {
    public abstract Fruit makeFruit();

    public static AbstractFabric getRandomFabric() {
        int rndIndex = (int) Math.floor(1 + (5 - 1) * Math.random());
        AbstractFabric rndFabric;

        switch (rndIndex) {
            case 1:
                rndFabric = new ThinOrangeFactory();
                break;
            case 2:
                rndFabric = new RedApplesFactory();
                break;
            case 3:
                rndFabric = new GreenApplesFactory();
                break;
            case 4:
                rndFabric = new LongPineapplesFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rndIndex);
        }
        return rndFabric;
    }

    @Override
    public String toString() {
        return getClass().getName().replace("lesson4task2.", "");
    }
}
