package com.mesozoic_eden.app.model;

public class Employee {
    private String name;
    private String jobTitle;
    private int yearsOfExperience;

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

    public void displayEmployeeInfo() {
        System.out.println("======================");
        System.out.println("Employee info:");
        System.out.println("    name:\t\t" + this.name);
        System.out.println("    job title:\t\t" + this.jobTitle);
        System.out.println("    years of xp:\t" + this.yearsOfExperience);
        System.out.println("======================");
    }

    public void displayEmployeeInfoShort() {
        System.out.println(this.name + "\t" + this.jobTitle + "\t" + this.yearsOfExperience);
    }

}
