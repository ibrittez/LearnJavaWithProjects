package com.mesozoic_eden.app.model.employee;

/**
 * Security
 */
public class Security extends Employee {
    public Security(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public String getJobTitle() {
        return "Security";
    }

}
