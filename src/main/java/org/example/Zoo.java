package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        System.out.println(animal.getName() + " has been removed from the zoo.");
    }

    public void modifyDetails(Animal animal) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new " + animal.getClass().getSimpleName() + " Sound: ");
        String newSound = scanner.nextLine();
        System.out.print("Enter new " + animal.getClass().getSimpleName() + " Description: ");
        String newDescription = scanner.nextLine();

        animal.setSound(newSound);
        animal.setDescription(newDescription);

        System.out.println(animal.getClass().getSimpleName() + " details modified successfully.");
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
