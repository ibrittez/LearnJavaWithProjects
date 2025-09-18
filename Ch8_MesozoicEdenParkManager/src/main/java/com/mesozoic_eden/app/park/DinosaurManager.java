package com.mesozoic_eden.app.park;

import com.mesozoic_eden.app.model.Dinosaur;
import com.mesozoic_eden.app.model.DinosaurType;

public class DinosaurManager {
    private DinosaurStatus[] dinosaurs;
    private int dinoCount = 0;
    private final int DINO_MAX = 20;

    public DinosaurManager() {
        this.dinosaurs = new DinosaurStatus[DINO_MAX];
    }

    public void add(Dinosaur dino, ParkLocations location, String status) {
        if (dinoCount >= DINO_MAX) {
            System.out.println("ERROR: Park is full");
            return;
        }
        dinosaurs[dinoCount++] = new DinosaurStatus(dino, location, status);
    }

    public void remove(Dinosaur dino) {
        for (int i = 0; i < dinoCount; i++) {
            if (dinosaurs[i].getDinosaur().equals(dino)) {
                for (int j = i + 1; j < dinoCount; j++) {
                    dinosaurs[j - 1] = dinosaurs[j];
                }
                dinoCount--;
                return;
            }
        }
        System.out.println("ERROR: Dinosaur not found");
    }

    public void displayAll() {
        if (dinoCount == 0) {
            System.out.println("[WARNING]: No dinosaurs");
            return;
        }
        System.out.println("ID\tName\tAge\tSpecies\t\tType\t\tLocation\tStatus");
        for (int i = 0; i < dinoCount; i++) {
            Dinosaur d = dinosaurs[i].getDinosaur();
            System.out.printf(
                    "%d\t%s\t%d\t%s\t%s\t%s\t%s%n",
                    i, d.getName(), d.getAge(), d.getSpecies(), d.getType(),
                    dinosaurs[i].getLocation(), dinosaurs[i].getStatus());
        }
    }

    public void editName(String name, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].getDinosaur().setName(name);
    }

    public void editAge(int age, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].getDinosaur().setAge(age);
    }

    public void editSpecies(String species, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].getDinosaur().setSpecies(species);
    }

    public void editType(DinosaurType type, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].getDinosaur().setType(type);
    }

    public void removeFromIndex(int index) {
        if (!validateIndex(index)) {
            return;
        }

        remove(dinosaurs[index].getDinosaur());
    }

    private boolean validateIndex(int index) {
        if (dinoCount == 0) {
            System.out.println("[WARNING]: No dinosaurs");
            return false;
        }

        if (index < 0 || index >= dinoCount) {
            System.out.println("[ERROR]: Invalid index");
            return false;
        }

        return true;
    }

}
