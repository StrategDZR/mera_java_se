package homework7;

import java.util.Objects;

public class Wolf extends WildAnimal {
    private String favoriteMeal = "Rabbit";

    @Override
    String getFavoriteMeal() {
        return favoriteMeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return name.equals(wolf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
