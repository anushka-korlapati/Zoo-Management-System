package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Attraction {

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the attraction.");
    }
    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    private int noOfTickets;
    private static int attractionCounter = 0;
    private int unique_id;

    public int getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(int unique_id) {
        this.unique_id = unique_id;
    }

    public Attraction() {
        attractionCounter++;
        this.unique_id = attractionCounter;
    }

    List<Animal> animals = new ArrayList<>();

    private String name;
    private int ticket_price;
    private boolean open_close;
    private String attraction_description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public boolean isOpen_close() {
        return open_close;
    }

    public void setOpen_close(boolean open_close) {
        this.open_close = open_close;
    }

    public String getAttractionDescription() {
        return attraction_description;
    }

    public void setAttractionDescription(String attraction_description) {
        this.attraction_description = attraction_description;
    }

    public void inputAttractionDetails(Scanner scanner) {
        System.out.print("Enter Attraction Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Attraction Description: ");
        this.attraction_description = scanner.nextLine();
        System.out.print("Enter Attraction Price: ");
        this.ticket_price = scanner.nextInt();
    }

    public void viewAttractionDetails() {
        System.out.println("Attraction Name: " + name);
        System.out.println("Attraction Description: " + attraction_description);
        System.out.println("Attraction Price: " + ticket_price);

        System.out.println("Animals: ");
        if (animals.isEmpty()) {
            System.out.println("No animals in this attraction.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal.getName());
            }
        }

        if (open_close) {
            System.out.println("Availability: Open");
        } else {
            System.out.println("Availability: Closed");
        }
    }

    public int countAnimalsOfType(Class<? extends Animal> animalType) {
        int count = 0;

        for (Animal animal : animals) {
            if (animalType.isInstance(animal)) {
                count++;
            }
        }

        return count;
    }

}
