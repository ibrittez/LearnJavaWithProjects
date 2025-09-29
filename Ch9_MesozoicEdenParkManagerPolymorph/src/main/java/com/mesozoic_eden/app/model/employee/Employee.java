package com.mesozoic_eden.app.model.employee;

public abstract class Employee {
    private String name;
    private int yearsOfExperience;
    private EmployeeShifts shift = EmployeeShifts.UNASIGNED;

    public Employee(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getJobTitle();

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setShift(EmployeeShifts shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.getJobTitle() + "\t" + this.yearsOfExperience + "\t\t" + this.shift.toString();
    }
}
