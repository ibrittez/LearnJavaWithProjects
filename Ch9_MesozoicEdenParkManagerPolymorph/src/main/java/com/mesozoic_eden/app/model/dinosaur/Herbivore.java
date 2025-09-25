package com.mesozoic_eden.app.model.dinosaur;

public abstract class Herbivore extends Dinosaur {
    public Herbivore(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDietType() {
        return "Herbivore";
    }
}
