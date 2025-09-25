package com.mesozoic_eden.app.model.dinosaur;

/**
 *Velociraptor 
 */
public class Velociraptor extends Carnivore {
    public Velociraptor(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Velociraptor";
    }
}
