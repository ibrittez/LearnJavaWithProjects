package com.mesozoic_eden.app.model.dinosaur;

/**
 * Coloradisaurus 
 */
public class Coloradisaurus extends Omnivore {
    public Coloradisaurus(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Coloradisaurus";
    }
}
