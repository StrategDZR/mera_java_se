package lesson4task2;

import lesson4task1.Apple;
import lesson4task1.Fruit;

public class GreenApplesFactory extends AbstractFabric {

    public GreenApplesFactory() {
    }

    @Override
    public Fruit makeFruit() {
        return new Apple("Green");
    }
}
