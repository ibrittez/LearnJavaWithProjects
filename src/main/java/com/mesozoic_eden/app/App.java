package com.mesozoic_eden.app;

import java.util.Scanner;

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
                // checkParkHours();
                break;
            case 3:
                // greetGuest();
                break;
            case 4:
                // checkVisitorsCount();
                break;
            case 5:
                // manageStaff();
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
}
