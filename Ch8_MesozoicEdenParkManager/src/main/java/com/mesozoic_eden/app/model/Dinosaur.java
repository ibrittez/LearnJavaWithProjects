package com.mesozoic_eden.app.model;

public class Dinosaur {
    private String name;
    private int age;
    private String species;
    private DinosaurType type;

    public Dinosaur(String name, int age, String species, DinosaurType type) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSpecies() {
        return this.species;
    }

    public void displayDinosaurInfo() {
        System.out.println("======================");
        System.out.println("Dinosaur info:");
        System.out.println("    name:\t\t" + this.name);
        System.out.println("    age:\t\t" + this.age);
        System.out.println("    species:\t\t" + this.species);
        System.out.println("    type:\t\t" + this.type);
        System.out.println("======================");
    }

    public void displayDinosaurInfoShort() {
        System.out.println(this.name + "\t" + this.age + "\t" + this.species + "\t" + this.type);
    }

}
