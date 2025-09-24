package com.mesozoic_eden.app.park;

import com.mesozoic_eden.app.model.dinosaur.Dinosaur;

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
            System.out.println(i + "\t" + dinosaurs[i].getDinosaur() + "\t" + dinosaurs[i].getLocation() + "\t"
                    + dinosaurs[i].getStatus());
        }
    }

    /*
     * ===========================
     * [EDIT DINOSAUR ATRIBUTTES]
     * ===========================
     */

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

    /*
     * ===========================
     * [EDIT DINOSAUR STATUS]
     * ===========================
     */

    public void editLocation(ParkLocations location, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].setLocation(location);
    }

    public void editStatus(String status, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].setStatus(status);
    }

    /*
     * ===========================
     * [UTILITIES]
     * ===========================
     */

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
