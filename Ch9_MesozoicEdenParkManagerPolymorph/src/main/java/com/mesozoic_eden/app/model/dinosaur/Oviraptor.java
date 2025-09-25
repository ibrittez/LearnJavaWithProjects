package com.mesozoic_eden.app.model.dinosaur;

/**
 * Oviraptor 
 */
public class Oviraptor extends Omnivore {
    public Oviraptor(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Oviraptor";
    }
}
