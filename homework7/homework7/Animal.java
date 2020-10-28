package homework7;

import java.util.Random;
import java.util.Set;

public abstract class Animal {
    abstract String getFavoriteMeal();
    String[] animalNames = new String[]{"Маша", "Миша", "Катя", "Валера", "Норка", "Семён", "Иван Иваныч", "Джон", "Молли"};
    String name = getRandomAnimalName();

    public String getName() {
        return name;
    }

    public String getRandomAnimalName() {
        int rnd = new Random().nextInt(animalNames.length);
        return animalNames[rnd];
    }
}