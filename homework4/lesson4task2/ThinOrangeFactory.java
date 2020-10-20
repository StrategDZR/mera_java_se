package lesson4task2;

import lesson4task1.Fruit;
import lesson4task1.Orange;

public class ThinOrangeFactory extends AbstractFabric {

    public ThinOrangeFactory() {
    }

    @Override
    public Fruit makeFruit() {
        return new Orange(1, 5);
    }
}
