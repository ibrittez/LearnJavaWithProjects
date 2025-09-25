package com.mesozoic_eden.app.model.dinosaur;

/**
 * Gigantosaurus
 */
public class Gigantosaurus extends Carnivore {
    public Gigantosaurus(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Gigantosaurus";
    }
}
