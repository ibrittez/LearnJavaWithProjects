package com.mesozoic_eden.app;

import com.mesozoic_eden.app.model.Dinosaur;
import com.mesozoic_eden.app.model.DinosaurType;
import com.mesozoic_eden.app.model.Employee;
import com.mesozoic_eden.app.park.Park;
import java.util.Scanner;

public class App {
    public Scanner scanner = new Scanner(System.in);
    public Park mesoEden = new Park("Mesozoic Eden");

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {
        populatePark(); // TODO: remove this; it's only for testing (check unnecesary imports after).
        Menus menus = new Menus(scanner, mesoEden);
        while (true) {
            menus.displayMainMenu();
            int choice = scanner.nextInt();
            menus.handleMainMenuChoice(choice);
        }
    }

    private void populatePark() {
        mesoEden.getDinosaurManager().add(new Dinosaur("Rexy", 78, "Tiranosaurus", DinosaurType.CARNIVORE));
        mesoEden.getDinosaurManager().add(new Dinosaur("Argy", 35, "Argentinosaurus", DinosaurType.HERVIBORE));
        mesoEden.getDinosaurManager().add(new Dinosaur("Bronko", 10, "Broncosaurus", DinosaurType.OMNIVORE));
        mesoEden.getDinosaurManager().add(new Dinosaur("Dummy", 67, "Dummysaurus", DinosaurType.OMNIVORE));
        mesoEden.getDinosaurManager().add(new Dinosaur("Oldy", 189, "Oldysaurus", DinosaurType.HERVIBORE));

        mesoEden.getEmployeeManager().add(new Employee("Peter", "Security", 22));
        mesoEden.getEmployeeManager().add(new Employee("Maria", "Tour Guiding", 5));
        mesoEden.getEmployeeManager().add(new Employee("Mark", "Feeding ", 1));
        mesoEden.getEmployeeManager().add(new Employee("Emma", "Security", 28));
    }

}
