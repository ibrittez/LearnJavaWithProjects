package com.mesozoic_eden.app.model.dinosaur;

/**
 * Pachyrhinosaurus 
 */
public class Pachyrhinosaurus extends Herbivore {
    public Pachyrhinosaurus(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Pachyrhinosaurus";
    }
}
