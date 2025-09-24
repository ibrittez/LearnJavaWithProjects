package com.mesozoic_eden.app.handlers;

import java.util.Scanner;

import com.mesozoic_eden.app.model.dinosaur.*;
import com.mesozoic_eden.app.park.Park;
import com.mesozoic_eden.app.park.ParkLocations;

public class DinoHandler {
    Scanner scanner;
    Park park;

    public DinoHandler(Scanner scanner, Park park) {
        this.scanner = scanner;
        this.park = park;
    }

    public void list() {
        park.getDinosaurManager().displayAll();
    }

    public void add() {
        scanner.nextLine(); // fflush(stdin)
                            //
        String name = readDinoName();

        int age = readDinoAge();

        scanner.nextLine(); // fflush(stdin)
        String species = readDinoSpecies();

        Dinosaur dino = readDinoType(name, age, species);

        ParkLocations location = readDinoLocation();

        scanner.nextLine(); // fflush(stdin)
        String status = readDinoStatus();

        park.getDinosaurManager().add(dino, location, status);
    }

    public void edit() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert dino ID: ");
        int id = scanner.nextInt();

        System.out.println("Which field do you want to edit?");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. Species");
        System.out.println("0. Abort");

        scanner.nextLine(); // fflush(stdin)

        int field = scanner.nextInt();
        scanner.nextLine(); // fflush(stdin)
        switch (field) {
            case 1 -> {
                park.getDinosaurManager().editName(readDinoName(), id);
            }
            case 2 -> {
                park.getDinosaurManager().editAge(readDinoAge(), id);
            }
            case 3 -> {
                park.getDinosaurManager().editSpecies(readDinoSpecies(), id);
            }
        }

    }

    public void editStatus() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert dino ID: ");
        int id = scanner.nextInt();

        System.out.println("Which status attribute do you want to edit?");
        System.out.println("1. Location");
        System.out.println("2. Status");

        scanner.nextLine(); // fflush(stdin)

        int field = scanner.nextInt();
        scanner.nextLine(); // fflush(stdin)
        switch (field) {
            case 1 -> {
                park.getDinosaurManager().editLocation(readDinoLocation(), id);
            }
            case 2 -> {
                park.getDinosaurManager().editStatus(readDinoStatus(), id);
            }
        }

    }

    public void remove() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert the ID of to dino to be removed: ");
        int id = scanner.nextInt();

        park.getDinosaurManager().removeFromIndex(id);
    }

    private String readDinoName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }

    private int readDinoAge() {
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        return age;
    }

    private String readDinoSpecies() {
        System.out.print("Enter species: ");
        String species = scanner.nextLine();
        return species;
    }

    private Dinosaur readDinoType(String name, int age, String species) {
        System.out.println("Select dinosaur type:");
        System.out.println("1. Carnivore");
        System.out.println("2. Herbivore");
        System.out.println("3. Omnivore");
        System.out.print("choice: ");

        int typeInput = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        return switch (typeInput) {
            case 1 -> new Carnivore(name, age, species);
            case 2 -> new Herbivore(name, age, species);
            case 3 -> new Omnivore(name, age, species);
            default -> new Omnivore(name, age, species);
        };
    }

    private ParkLocations readDinoLocation() {
        System.out.println("Enter location: ");
        for (ParkLocations location : ParkLocations.values()) {
            System.out.println((location.ordinal() + 1) + ". " + location.name());
        }
        System.out.print("choice: ");

        int typeInput = scanner.nextInt();

        return ParkLocations.values()[typeInput - 1];
    }

    private String readDinoStatus() {
        System.out.print("Enter status: ");
        String status = scanner.nextLine();
        return status;
    }

}
