package org.example;

public class Mammal implements Animal {
    private String name;
    private String sound;
    private String description;

    public Mammal(String name, String sound, String description) {
        this.name = name;
        this.sound = sound;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void viewAnimalDetails() {
        System.out.println("Animal Name: " + name);
        System.out.println("Sound: " + sound);
        System.out.println("Description: " + description);
    }

}
