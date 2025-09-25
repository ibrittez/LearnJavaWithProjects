package com.mesozoic_eden.app.model.dinosaur;

public abstract class Dinosaur {
    private String name;
    private int age;

    public Dinosaur(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getDietType();

    public abstract String getSpecies();

    @Override
    public String toString() {
        return this.name + "\t" + this.age + "\t" + getSpecies() + "\t" + getDietType();
    }

}
