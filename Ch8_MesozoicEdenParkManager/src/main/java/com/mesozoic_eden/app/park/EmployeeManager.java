package com.mesozoic_eden.app.park;

import com.mesozoic_eden.app.model.Employee;

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
        System.out.println("Name \tJob Title \tYears of XP");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployeeInfoShort();
        }
    }
}
