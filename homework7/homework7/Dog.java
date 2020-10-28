package homework7;

import java.util.Objects;

public class Dog extends PetAnimal {
    private String favoriteMeal = "Meat";

    @Override
    String getFavoriteMeal() {
        return favoriteMeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
