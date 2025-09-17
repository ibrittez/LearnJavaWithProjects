package com.mesozoic_eden.app;

import java.util.Scanner;
import com.mesozoic_eden.app.park.Park;

public class Menus {
    Scanner scanner;
    Park park;

    private boolean dinoFlag = false;

    public Menus(Scanner scanner, Park park) {
        this.scanner = scanner;
        this.park = park;
    }

    private void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /*
     * =======================
     * [MAIN MENU]
     * =======================
     */
    public void displayMainMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Manage Dinosaurs");
        System.out.println("2. Manage Park Employees");
        System.out.println("3. Manage Tickets");
        System.out.println("4. Check Park Status");
        System.out.println("5. Handle Special Event");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void handleMainMenuChoice(int choice) {
        cleanScreen();

        switch (choice) {
            case 1:
                // manageDinosaurs();
                break;
            case 2:
                // manageEmployees();
                break;
            case 3:
                // manageTickets();
                break;
            case 4:
                // checkVisitorsCount();
                break;
            case 5:
                // manageStaff();
                break;
            default:
                System.out.println("[ERROR]: Invalid option");
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }
}
