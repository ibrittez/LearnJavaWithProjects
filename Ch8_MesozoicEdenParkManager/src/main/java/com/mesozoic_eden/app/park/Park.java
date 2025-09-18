package com.mesozoic_eden.app.park;

public class Park {
    private String name;
    private boolean isParkOpen;

    private DinosaurManager dinosaurManager;
    private EmployeeManager employeeManager;
    private TicketManager ticketManager;

    public Park(String name) {
        this.name = name;
        this.isParkOpen = false;
        this.dinosaurManager = new DinosaurManager();
        this.employeeManager = new EmployeeManager();
        this.ticketManager = new TicketManager();
    }

    public void openPark() {
        isParkOpen = true;
    }

    public void closePark() {
        isParkOpen = false;
    }

    public DinosaurManager getDinosaurManager() {
        return dinosaurManager;
    }

    public EmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }
}
