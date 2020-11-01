package homework7;

import java.util.Objects;
import java.util.Random;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}