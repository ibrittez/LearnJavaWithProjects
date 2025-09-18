package com.mesozoic_eden.app.model;

public class Employee {
    private String name;
    private String jobTitle;
    private int yearsOfExperience;
    private EmployeeShifts shift = EmployeeShifts.UNASIGNED;

    public Employee(String name, String jobTitle, int yearsOfExperience) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return this.name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setShift(EmployeeShifts shift){
        this.shift = shift;
    }

    public void displayEmployeeInfo() {
        System.out.println("======================");
        System.out.println("Employee info:");
        System.out.println("    name:\t\t" + this.name);
        System.out.println("    job title:\t\t" + this.jobTitle);
        System.out.println("    years of xp:\t" + this.yearsOfExperience);
        System.out.println("    shift\t" + this.shift.toString());
        System.out.println("======================");
    }

    public void displayEmployeeInfoShort() {
        System.out.println(
                this.name + "\t" + this.jobTitle + "\t" + this.yearsOfExperience + "\t\t" + this.shift.toString());
    }

}
