package com.mesozoic_eden.app.park;

import com.mesozoic_eden.app.model.Dinosaur;
import com.mesozoic_eden.app.model.DinosaurType;

public class DinosaurManager {
    private Dinosaur[] dinosaurs;
    private int dinoCount = 0;
    private final int DINO_MAX = 20;

    public DinosaurManager() {
        this.dinosaurs = new Dinosaur[DINO_MAX];
    }

    public void add(Dinosaur dino) {
        if (dinoCount >= DINO_MAX) {
            System.out.println("ERROR: Park is full");
            return;
        }
        dinosaurs[dinoCount++] = dino;
    }

    public void remove(Dinosaur dino) {
        for (int i = 0; i < dinoCount; i++) {
            if (dinosaurs[i].equals(dino)) {
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
        System.out.println("ID \tName \tAge \tSpecies \tType");
        for (int i = 0; i < dinoCount; i++) {
            System.out.print(i + "\t");
            dinosaurs[i].displayDinosaurInfoShort();
        }
    }

    public void editName(String name, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].setName(name);
    }

    public void editAge(int age, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].setAge(age);
    }

    public void editSpecies(String species, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].setSpecies(species);
    }

    public void editType(DinosaurType type, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.dinosaurs[index].setType(type);
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
