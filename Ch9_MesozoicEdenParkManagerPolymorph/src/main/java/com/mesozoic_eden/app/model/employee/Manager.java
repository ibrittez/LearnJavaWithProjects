package com.mesozoic_eden.app.model.employee;

/**
 * Manager
 */
public class Manager extends Employee {
    public Manager(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public String getJobTitle() {
        return "Manager";
    }

}
