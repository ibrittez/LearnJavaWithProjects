package com.mesozoic_eden.app.model.dinosaur;

/**
 *Brachiosaurus 
 */
public class Brachiosaurus extends Herbivore {
    public Brachiosaurus(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Brachiosaurus";
    }
}
