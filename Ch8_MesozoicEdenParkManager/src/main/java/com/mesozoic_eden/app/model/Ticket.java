package com.mesozoic_eden.app.model;

import java.time.LocalDate;

public class Ticket {
    double price;
    String visitorName;
    LocalDate visitDate;

    public Ticket(double price, String visitorName) {
        this.price = price;
        this.visitorName = visitorName;
        this.visitDate = LocalDate.now();
    }

    public void displayTicketInfo() {
        System.out.println("======================");
        System.out.println("Ticket info:");
        System.out.println("    price\t\t\t: " + this.price);
        System.out.println("    visitor name\t\t: " + this.visitorName);
        System.out.println("    visit date\t\t\t: " + this.visitDate);
        System.out.println("======================");
    }

}
