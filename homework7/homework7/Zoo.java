package homework7;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Zoo {
    private Set<PetAnimal> petAnimalSet = new LinkedHashSet<>();
    private Set<WildAnimal> wildAnimalSet = new LinkedHashSet<>();

    public Zoo() {
        fillCollectionWithPetAnimals(petAnimalSet);
        fillCollectionWithWildAnimals(wildAnimalSet);
    }

    void fillCollectionWithPetAnimals(Set<PetAnimal> set) {
        int rnd = new Random().nextInt(5 - 1) + 1;
        for (int i = 0; i < rnd; i++) {
            set.add(getRandomPetAnimal());
        }
    }

    void fillCollectionWithWildAnimals(Set<WildAnimal> set) {
        int rnd = new Random().nextInt(10 - 3) + 3;
        for (int i = 0; i < rnd; i++) {
            set.add(getRandomWildAnimal());
        }
    }

    private PetAnimal getRandomPetAnimal() {
        PetAnimal animal;
        int rnd = new Random().nextInt(2);
        if (rnd == 0) {
            animal = new Cat();
        } else {
            animal = new Dog();
        }
        return animal;
    }

    private WildAnimal getRandomWildAnimal() {
        WildAnimal animal;
        int rnd = new Random().nextInt(2);
        if (rnd == 0) {
            animal = new Fox();
        } else {
            animal = new Wolf();
        }
        return animal;
    }

    private void printAnimalsFromCollection(Set<? extends Animal> set) {
        for (Animal animal : set) {
            System.out.println(animal.getName());
        }
    }

    public void printAllAnimals() {
        printAnimalsFromCollection(petAnimalSet);
        printAnimalsFromCollection(wildAnimalSet);
    }
}
