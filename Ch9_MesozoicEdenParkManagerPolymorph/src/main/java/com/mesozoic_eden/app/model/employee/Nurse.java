package com.mesozoic_eden.app.model.employee;

/**
 * Nurse
 */
public class Nurse extends Employee {
    public Nurse(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public String getJobTitle() {
        return "Nurse";
    }

}
