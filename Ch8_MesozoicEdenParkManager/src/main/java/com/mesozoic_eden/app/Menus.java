package com.mesozoic_eden.app;

import java.util.Scanner;
import com.mesozoic_eden.app.park.Park;
import com.mesozoic_eden.app.handlers.DinoHandler;
import com.mesozoic_eden.app.handlers.EmployeeHandler;

public class Menus {
    Scanner scanner;
    Park park;

    private boolean dinoFlag = false;
    private boolean employeeFlag = false;

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
                this.dinoFlag = true;
                while (dinoFlag) {
                    displayDinoMenu();
                    int dinoChoice = scanner.nextInt();
                    handleDinoMenuChoice(dinoChoice);
                }
                break;
            case 2:
                this.employeeFlag = true;
                while (employeeFlag) {
                    displayEmployeeMenu();
                    int employeeChoice = scanner.nextInt();
                    handleEmployeeMenuChoice(employeeChoice);
                }
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

    /*
     * =======================
     * [DINO MENU]
     * =======================
     */

    public void displayDinoMenu() {
        System.out.println("1. List Dinosaurs");
        System.out.println("2. Add Dinosaur");
        System.out.println("3. Edit Dinosaur Attributes");
        System.out.println("4. Edit Dinosaur Status");
        System.out.println("5. Remove Dinosaur");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void handleDinoMenuChoice(int choice) {
        DinoHandler handler = new DinoHandler(scanner, park);

        cleanScreen();

        switch (choice) {
            case 1:
                handler.list();
                break;
            case 2:
                handler.add();
                break;
            case 3:
                handler.edit();
                break;
            case 4:
                handler.editStatus();
                break;
            case 5:
                handler.remove();
                break;
            default:
                break;
            case 0:
                System.out.println("Exiting dino menu");
                this.dinoFlag = false;
        }
    }

    /*
     * =======================
     * [EMPLOYEE MENU]
     * =======================
     */

    public void displayEmployeeMenu() {
        System.out.println("1. List Employees");
        System.out.println("2. Add Employee");
        System.out.println("3. Edit Employee");
        System.out.println("4. Update shift");
        System.out.println("5. Remove Employee");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void handleEmployeeMenuChoice(int choice) {
        EmployeeHandler handler = new EmployeeHandler(scanner, park);

        cleanScreen();

        switch (choice) {
            case 1:
                handler.list();
                break;
            case 2:
                handler.add();
                break;
            case 3:
                handler.edit();
                break;
            case 4:
                handler.updateShift();
                break;
            case 5:
                handler.remove();
                break;
            default:
                break;
            case 0:
                System.out.println("Exiting employee menu");
                this.employeeFlag = false;
        }
    }

}
