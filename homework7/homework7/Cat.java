package homework7;

import java.util.Objects;

public class Cat extends PetAnimal {
    private String favoriteMeal = "Fish";

    @Override
    String getFavoriteMeal() {
        return favoriteMeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
