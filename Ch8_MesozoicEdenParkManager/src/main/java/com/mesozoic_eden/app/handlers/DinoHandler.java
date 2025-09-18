package com.mesozoic_eden.app.handlers;

import java.util.Scanner;

import com.mesozoic_eden.app.model.Dinosaur;
import com.mesozoic_eden.app.model.DinosaurType;
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

        DinosaurType type = readDinoType();

        ParkLocations location = readDinoLocation();

        scanner.nextLine(); // fflush(stdin)
        String status = readDinoStatus();

        Dinosaur dino = new Dinosaur(name, age, species, type);
        park.getDinosaurManager().add(dino, location, status);
    }

    public void edit() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert dino ID: ");
        int id = scanner.nextInt();

        System.out.println("ID \tName \tAge \tSpecies \tType");
        System.out.println("Which field do you want to edit?");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. Species");
        System.out.println("4. Type");
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
            case 4 -> {
                park.getDinosaurManager().editType(readDinoType(), id);
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

    private DinosaurType readDinoType() {
        System.out.println("Enter type: ");
        System.out.println("1. HERVIBORE");
        System.out.println("2. CARNIVORE");
        System.out.println("3. OMNIVORE (default)");
        System.out.print("choice: ");
        int typeInput = scanner.nextInt();
        DinosaurType actualType = DinosaurType.OMNIVORE;
        switch (typeInput) {
            case 1 -> actualType = DinosaurType.HERVIBORE;
            case 2 -> actualType = DinosaurType.CARNIVORE;
            case 3 -> actualType = DinosaurType.OMNIVORE;
        }

        return actualType;
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
