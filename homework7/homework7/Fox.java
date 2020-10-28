package homework7;

import java.util.Objects;

public class Fox extends WildAnimal {
    private String favoriteMeal = "Kolobok";

    @Override
    String getFavoriteMeal() {
        return favoriteMeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fox fox = (Fox) o;
        return name.equals(fox.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
