package com.mesozoic_eden.app.handlers;

import java.util.Scanner;

import com.mesozoic_eden.app.model.Dinosaur;
import com.mesozoic_eden.app.model.DinosaurType;
import com.mesozoic_eden.app.park.Park;

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
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Enter species: ");
        String species = scanner.nextLine();

        System.out.println("Enter type (CARNIVORE/HERVIBORE/OMNIVORE): ");
        System.out.println("1. HERVIBORE");
        System.out.println("2. CARNIVORE");
        System.out.println("3. OMNIVORE (default)");
        int typeInput = scanner.nextInt();
        DinosaurType actualType = DinosaurType.OMNIVORE;
        switch (typeInput) {
            case 1 -> actualType = DinosaurType.HERVIBORE;
            case 2 -> actualType = DinosaurType.CARNIVORE;
            case 3 -> actualType = DinosaurType.OMNIVORE;
        }

        Dinosaur dino = new Dinosaur(name, age, species, actualType);
        park.getDinosaurManager().add(dino);
    }
}
