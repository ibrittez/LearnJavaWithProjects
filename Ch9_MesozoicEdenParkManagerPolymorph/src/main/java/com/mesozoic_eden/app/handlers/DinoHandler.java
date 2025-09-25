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

        cleanScreen();
                            //
        String name = readDinoName();

        int age = readDinoAge();

        Dinosaur dino = readDinoType(name, age);

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
        System.out.println("0. Abort");
        System.out.print("choice: ");

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
        System.out.print("choice: ");

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

    private Dinosaur readDinoType(String name, int age) {
        System.out.println("Select dinosaur type:");
        System.out.println("1. Carnivore");
        System.out.println("2. Herbivore");
        System.out.println("3. Omnivore");
        System.out.print("choice: ");

        int typeInput = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        return switch (typeInput) {
            case 1 -> readCarnivoreSpecies(name, age);
            case 2 -> readHerbivoreSpecies(name, age);
            case 3 -> readOmnivoreSpecies(name, age);
            default -> throw new IllegalArgumentException("[ERROR] Invalid choice: " + typeInput);
        };
    }

    private Dinosaur readCarnivoreSpecies(String name, int age) {
        System.out.println("Select carnivore species:");
        System.out.println("1. Tiranosaurus Rex");
        System.out.println("2. Velociraptor");
        System.out.println("3. Gigantosaurus");
        System.out.print("choice: ");

        int typeInput = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        return switch (typeInput) {
            case 1 -> new TRex(name, age);
            case 2 -> new Velociraptor(name, age);
            case 3 -> new Gigantosaurus(name, age);
            default -> throw new IllegalArgumentException("[ERROR] Invalid choice: " + typeInput);
        };
    }

    private Dinosaur readHerbivoreSpecies(String name, int age) {
        System.out.println("Select herbivore species:");
        System.out.println("1. Argentinosaurus");
        System.out.println("2. Brachiosaurus");
        System.out.println("3. Pachyrhinosaurus");
        System.out.print("choice: ");

        int typeInput = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        return switch (typeInput) {
            case 1 -> new Argentinosaurus(name, age);
            case 2 -> new Brachiosaurus(name, age);
            case 3 -> new Pachyrhinosaurus(name, age);
            default -> throw new IllegalArgumentException("[ERROR] Invalid choice: " + typeInput);
        };
    }

    private Dinosaur readOmnivoreSpecies(String name, int age) {
        System.out.println("Select carnivore species:");
        System.out.println("1. Coloradisaurus");
        System.out.println("2. Ornithomimus");
        System.out.println("3. Oviraptor");
        System.out.print("choice: ");

        int typeInput = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        return switch (typeInput) {
            case 1 -> new Coloradisaurus(name, age);
            case 2 -> new Ornithomimus(name, age);
            case 3 -> new Oviraptor(name, age);
            default -> throw new IllegalArgumentException("[ERROR] Invalid choice: " + typeInput);
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

    private void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
