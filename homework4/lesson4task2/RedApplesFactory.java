package lesson4task2;

import lesson4task1.Apple;
import lesson4task1.Fruit;

public class RedApplesFactory extends AbstractFabric {

    @Override
    public Fruit makeFruit() {
        return new Apple("Red");
    }
}
