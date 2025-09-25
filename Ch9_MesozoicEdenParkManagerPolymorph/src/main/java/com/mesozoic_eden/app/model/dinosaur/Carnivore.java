package com.mesozoic_eden.app.model.dinosaur;

public abstract class Carnivore extends Dinosaur {
    public Carnivore(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDietType() {
        return "Carnivore";
    }
}
