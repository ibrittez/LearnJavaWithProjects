package com.mesozoic_eden.app;

import java.util.Scanner;
import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    Scanner scanner = new Scanner(System.in);

    // Inicializo los arreglos para almacenar la info de diez dinos.
    String[] dinoNames = new String[10];
    int[] dinoAges = new int[10];
    int[] dinoWeights = new int[10];
    int dinoCount = 0;

    // Info de los invitados.
    String[] guestNames = { "Pepe", "Victor", "Maria", "Juliana" };

    // Info de los empleados.
    String[] employees = { "Marcos", "Cristina", "Ricardo" };
    String[] employeesJob = { "Security", "Feeding", "Tour guiding" };

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Add Dinosaur");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitors Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Display dino list");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addDinosaur();
                break;
            case 2:
                checkParkHours();
                break;
            case 3:
                greetGuest();
                break;
            case 4:
                checkVisitorsCount();
                break;
            case 5:
                manageStaff();
                break;
            case 6:
                displayDinos();
                break;
            default:
                System.out.println("[ERROR]: Invalid option");
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }

    public void addDinosaur() {
        if (dinoCount >= 10) {
            System.out.println("[ERROR]: The park its operating at maximum dino capacity");
            return;
        }

        scanner.nextLine(); // fflush(stdin)

        System.out.println("Insert dino name: ");
        String name = scanner.nextLine();
        dinoNames[dinoCount] = name;

        System.out.println("Insert dino age: ");
        int age = scanner.nextInt();
        dinoAges[dinoCount] = age;

        System.out.println("Insert dino weight: ");
        int weight = scanner.nextInt();
        dinoWeights[dinoCount] = weight;

        dinoCount++;
    }

    public void displayDinos() {
        if (dinoCount == 0) {
            System.out.println("[ERROR]: No dinos availables.");
            return;
        }

        System.out.println("| Name\t| Age \t| Weight|");

        for (int i = 0; i < dinoCount; i++) {
            System.out.println("| " + dinoNames[i] + "\t| " + dinoAges[i] + "\t| " + dinoWeights[i] + "\t|");

        }
    }

    public void checkParkHours() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();

        if (hour >= 8 && hour <= 21) {
            System.out.println("The park is open!");
            return;
        }

        System.out.println("The park is closed!");
    }

    public void greetGuest() {
        for (String name : guestNames) {
            System.out.println("Welcome to Mesozoic Eden " + name + "!");
        }
    }

    public void checkVisitorsCount() {
        System.out.println("The park currently have " + guestNames.length + " visitors.");

        if (guestNames.length >= 10) {
            System.out.println("We are operating at full capacity. Don't let any extra visitor enter!");
            return;
        }

        System.out.println("You can let new visitors enter without any problem!");
    }

    public void manageStaff() {
        System.out.println("");
        displayEmployeeMenu();
        int choice = scanner.nextInt();
        handleEmployeeMenuChoice(choice);
    }

    public void displayEmployeeMenu() {
        System.out.println("1. List employees.");
        System.out.println("2. Change employee job");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public void handleEmployeeMenuChoice(int choice) {
        switch (choice) {
            case 1:
                listEmployees();
                break;
            case 2:
                changeEmployeeJob();
                break;
            default:
                System.out.println("[ERROR]: Invalid option");
            case 0:
                System.out.println("Exiting...");
                break;
        }
    }

    public void listEmployees() {
        System.out.println("| ID\t| Name\t\t| Job \t\t|");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("| " + i + "\t| " + employees[i] + "\t| " + employeesJob[i] + "\t|");
        }

    }

    public void changeEmployeeJob() {
        System.out.println("hint: insert id 999 to list the employees.");

        scanner.nextLine(); // fflush(stdin)

        System.out.println("Insert employee id: ");
        int id = scanner.nextInt();

        if (id == 999) {
            listEmployees();

            scanner.nextLine(); // fflush(stdin)
            System.out.println("Insert employee id: ");
            id = scanner.nextInt();
        }

        if (id >= employees.length) {
            System.out.println("[ERROR]: Invalid id");
            return;
        }

        scanner.nextLine(); // fflush(stdin)
        System.out.println("Insert employee new job: ");
        String newJob = scanner.nextLine();

        employeesJob[id] = newJob;
    }
}
