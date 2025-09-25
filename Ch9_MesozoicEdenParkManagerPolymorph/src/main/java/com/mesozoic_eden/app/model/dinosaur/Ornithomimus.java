package com.mesozoic_eden.app.model.dinosaur;

/**
 * Ornithomimus 
 */
public class Ornithomimus extends Omnivore {
    public Ornithomimus(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Ornithomimus";
    }
}
