package com.mesozoic_eden.app.model.employee;

/**
 * TourGuide
 */
public class TourGuide extends Employee {
    public TourGuide(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public String getJobTitle() {
        return "Tour Guide";
    }

}
