package homework7;

public class Dog extends PetAnimal {
    private String favoriteMeal = "Meat";

    @Override
    String getFavoriteMeal() {
        return favoriteMeal;
    }
}
