package com.mesozoic_eden.app.model;

public class Dinosaur {
    private String name;
    private int age;
    private String species;

    public Dinosaur(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.age + "\t" + this.species;
    }

}
