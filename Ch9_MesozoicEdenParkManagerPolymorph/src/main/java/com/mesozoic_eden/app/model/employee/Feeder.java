package com.mesozoic_eden.app.model.employee;

/**
 * Feeder
 */
public class Feeder extends Employee {
    public Feeder(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public String getJobTitle() {
        return "Feeder  ";
    }

}
