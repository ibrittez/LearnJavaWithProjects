package com.mesozoic_eden.app.model;

public class Guest {
    private String name;

    Guest(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void displayEmployeeInfo() {
        System.out.println("======================");
        System.out.println("Guest info:");
        System.out.println("    name:\t\t" + this.name);
        System.out.println("======================");
    }

}
