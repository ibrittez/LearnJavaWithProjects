package com.mesozoic_eden.app.park;

import com.mesozoic_eden.app.model.employee.*;

public class EmployeeManager {
    private Employee[] employees;
    private int employeeCount = 0;
    private final int EMPLOYEE_MAX = 10;

    public EmployeeManager() {
        this.employees = new Employee[EMPLOYEE_MAX];
    }

    public void add(Employee employee) {
        if (employeeCount >= EMPLOYEE_MAX) {
            System.out.println("ERROR: Park is full");
            return;
        }
        employees[employeeCount++] = employee;
    }

    public void remove(Employee employee) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].equals(employee)) {
                for (int j = i + 1; j < employeeCount; j++) {
                    employees[j - 1] = employees[j];
                }
                employeeCount--;
                return;
            }
        }
        System.out.println("ERROR: Employee not found");
    }

    public void displayAll() {
        if (employeeCount == 0) {
            System.out.println("[WARNING]: No employees");
            return;
        }

        System.out.println("ID \tName \tJob Title \tYears of XP \tShift");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(i + "\t" + employees[i]);
        }
    }

    public void editName(String name, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.employees[index].setName(name);
    }

    public void editYearsOfExperience(int yearsOfExperience, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.employees[index].setYearsOfExperience(yearsOfExperience);
    }

    public void editShift(EmployeeShifts shift, int index) {
        if (!validateIndex(index)) {
            return;
        }

        this.employees[index].setShift(shift);
    }

    public void removeFromIndex(int index) {
        if (!validateIndex(index)) {
            return;
        }

        remove(employees[index]);
    }

    private boolean validateIndex(int index) {
        if (employeeCount == 0) {
            System.out.println("[WARNING]: No employees");
            return false;
        }

        if (index < 0 || index >= employeeCount) {
            System.out.println("[ERROR]: Invalid index");
            return false;
        }

        return true;
    }
}
