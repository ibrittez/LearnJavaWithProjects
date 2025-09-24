package com.mesozoic_eden.app.model.dinosaur;

public class Carnivore extends Dinosaur {
    public Carnivore(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public String getDietType() {
        return "Carnivore";
    }
}
