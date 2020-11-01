package homework7;

public class Cat extends PetAnimal {
    private String favoriteMeal = "Fish";

    @Override
    String getFavoriteMeal() {
        return favoriteMeal;
    }
}
