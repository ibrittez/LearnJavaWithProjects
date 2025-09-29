package com.mesozoic_eden.app.handlers;

import java.util.Scanner;

import com.mesozoic_eden.app.model.employee.*;
import com.mesozoic_eden.app.park.Park;

public class EmployeeHandler {
    Scanner scanner;
    Park park;

    public EmployeeHandler(Scanner scanner, Park park) {
        this.scanner = scanner;
        this.park = park;
    }

    public void list() {
        park.getEmployeeManager().displayAll();
    }

    public void add() {
        scanner.nextLine(); // fflush(stdin)
                            //
        String name = readEmployeeName();

        String job = readEmployeeJob();

        int experience = readEmployeeExperience();

        Employee employee = new Employee(name, job, experience);
        park.getEmployeeManager().add(employee);
    }

    public void edit() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert employee ID: ");
        int id = scanner.nextInt();

        System.out.println("Which field do you want to edit?");
        System.out.println("1. Name");
        System.out.println("2. Job Title");
        System.out.println("3. Years of xp");
        System.out.println("0. Abort");

        scanner.nextLine(); // fflush(stdin)

        int field = scanner.nextInt();
        scanner.nextLine(); // fflush(stdin)
        switch (field) {
            case 1 -> {
                park.getEmployeeManager().editName(readEmployeeName(), id);
            }
            case 2 -> {
                park.getEmployeeManager().editJobTitle(readEmployeeJob(), id);
            }
            case 3 -> {
                park.getEmployeeManager().editYearsOfExperience(readEmployeeExperience(), id);
            }
        }

    }

    public void remove() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert the ID of the employee to be removed: ");
        int id = scanner.nextInt();

        park.getEmployeeManager().removeFromIndex(id);
    }

    public void updateShift() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert the ID of the employee to be updated: ");
        int id = scanner.nextInt();

        park.getEmployeeManager().editShift(readEmployeeShifts(), id);
    }

    private String readEmployeeName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }

    private String readEmployeeJob() {
        System.out.print("Enter job: ");
        String job = scanner.nextLine();
        return job;
    }

    private int readEmployeeExperience() {
        System.out.print("Enter years of experience: ");
        int xp = scanner.nextInt();
        return xp;
    }

    private EmployeeShifts readEmployeeShifts() {
        System.out.println("Enter shift: ");
        for (EmployeeShifts shift : EmployeeShifts.values()) {
            System.out.println(shift.ordinal() + ". " + shift.name());
        }
        System.out.print("choice: ");

        int shiftInput = scanner.nextInt();

        return EmployeeShifts.values()[shiftInput];
    }

}
