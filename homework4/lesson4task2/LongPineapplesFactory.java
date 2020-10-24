package lesson4task2;

import lesson4task1.Fruit;
import lesson4task1.Pineapple;

public class LongPineapplesFactory extends AbstractFabric {

    public LongPineapplesFactory() {
    }

    @Override
    public Fruit makeFruit() {
        return new Pineapple(10);
    }
}
