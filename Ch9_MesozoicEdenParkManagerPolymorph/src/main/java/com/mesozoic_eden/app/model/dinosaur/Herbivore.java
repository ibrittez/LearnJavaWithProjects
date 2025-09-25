package com.mesozoic_eden.app.model.dinosaur;

public class Herbivore extends Dinosaur {
    public Herbivore(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public String getDietType() {
        return "Herbivore";
    }
}
