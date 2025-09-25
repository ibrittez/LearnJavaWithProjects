package com.mesozoic_eden.app.model.dinosaur;

/**
 * TRex
 */
public class TRex extends Carnivore {
    public TRex(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSpecies() {
        return "Tyrannosaurus";
    }

}
