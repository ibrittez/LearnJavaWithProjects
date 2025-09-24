package com.mesozoic_eden.app.model.dinosaur;

public class Omnivore extends Dinosaur {
    public Omnivore(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public String getDietType() {
        return "Omnivore";
    }
}
