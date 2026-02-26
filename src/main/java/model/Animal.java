package model;

import java.time.LocalDate;

public class Animal {
    private final String type;
    private double weightInKg;
    private final Color color;
    private final boolean isCarnivore;
    private final LocalDate birthdate;

    /* SET */

    public Animal(String type, Color color, Boolean isCarnivore, LocalDate birthdate, double weightInKg) {
        this.type = type;
        this.weightInKg = weightInKg;
        this.color = color;
        this.isCarnivore = isCarnivore;
        this.birthdate = birthdate;
    }


    public void eat() {
        weightInKg *= 1.05;
    }

    public void move() {
        weightInKg *= 0.98;
    }

    /* GET */

    public String getType() {
        return type;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public Color getColor() {
        return color;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }


    @Override
    public String toString(){ //Wandelt ein Objekt in eine Zeichenkette um.
        return "Animal [type =" + type + ", color = " + color + "weightInKg = " + weightInKg + ", isCarnivore" + isCarnivore + ", birthdate= " + birthdate + "]";
    }
}
