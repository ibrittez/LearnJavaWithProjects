package com.mesozoic_eden.app;

import com.mesozoic_eden.app.model.dinosaur.*;
import com.mesozoic_eden.app.model.Employee;
import com.mesozoic_eden.app.model.Guest;
import com.mesozoic_eden.app.model.Ticket;
import com.mesozoic_eden.app.park.Park;
import com.mesozoic_eden.app.park.ParkLocations;

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
        mesoEden.getDinosaurManager().add(
                new TRex("Rexy", 78),
                ParkLocations.SAVANNA_PLAIN,
                "Roaming");

        mesoEden.getDinosaurManager().add(
                new Argentinosaurus("Argy", 35),
                ParkLocations.JUNGLE_RIVER,
                "Eating");

        mesoEden.getDinosaurManager().add(
                new Brachiosaurus("Bronko", 10),
                ParkLocations.RIVER_DELTA,
                "Sleeping");

        mesoEden.getDinosaurManager().add(
                new Coloradisaurus("Dummy", 67),
                ParkLocations.VISITOR_CENTER,
                "Idle");

        mesoEden.getDinosaurManager().add(
                new Oviraptor("Oldy", 189),
                ParkLocations.VISITOR_CENTER,
                "Resting");

        mesoEden.getEmployeeManager().add(new Employee("Peter", "Security", 22));
        mesoEden.getEmployeeManager().add(new Employee("Maria", "Tour Guiding", 5));
        mesoEden.getEmployeeManager().add(new Employee("Mark", "Feeding ", 1));
        mesoEden.getEmployeeManager().add(new Employee("Emma", "Security", 28));

        Guest guest1 = new Guest("Lionel Messi", true);
        Guest guest2 = new Guest("George Williams", false);
        Guest guest3 = new Guest("Emma Hill", false);
        mesoEden.getTicketManager().add(new Ticket(50.0, guest1));
        mesoEden.getTicketManager().add(new Ticket(25.0, guest2));
        mesoEden.getTicketManager().add(new Ticket(30.0, guest3));

        mesoEden.openPark();
    }

}
