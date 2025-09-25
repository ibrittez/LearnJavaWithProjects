package com.mesozoic_eden.app.model.dinosaur;

/**
 * Argentinosaurus
 */
public class Argentinosaurus extends Herbivore {
    public Argentinosaurus(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Argentinosaurus";
    }
}
