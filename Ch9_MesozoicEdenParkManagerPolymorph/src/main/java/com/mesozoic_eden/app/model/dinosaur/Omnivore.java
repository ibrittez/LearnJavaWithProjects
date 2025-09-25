package com.mesozoic_eden.app.model.dinosaur;

public abstract class Omnivore extends Dinosaur {
    public Omnivore(String name, int age) {
        super(name, age);
    }

    @Override
    public String getDietType() {
        return "Omnivore";
    }
}
