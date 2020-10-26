package homework5.task2;

import java.util.Random;

public class Person {
    private String name;
    private Season favouriteSeason;

    public Person() {
        this.name = getRandomName();
        this.favouriteSeason = Season.getRandomSeason();
    }

    public String getName() {
        return name;
    }

    public Season getFavouriteSeason() {
        return favouriteSeason;
    }

    private String getRandomName() {
        //would be great to add Faker lib here
        String[] names = new String[]{"Ivan", "Maria", "Don", "Bilbo", "Frodo", "Gandalf"};
        return names[new Random().nextInt(names.length)];
    }

    @Override
    public String toString() {
        return "У персоны с именем " + getName()
                + " любимая игра - " + getFavouriteSeason().getGame() + ".";
    }
}
