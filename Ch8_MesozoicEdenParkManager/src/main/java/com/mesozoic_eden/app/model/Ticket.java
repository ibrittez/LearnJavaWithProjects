package com.mesozoic_eden.app.model;

import java.time.LocalDate;

public class Ticket {
    double price;
    Guest guest;
    LocalDate visitDate;

    public Ticket(double price, Guest guest) {
        guest.setHasTicket(true);

        if (guest.getIsVip()) {
            this.price = 0;
        } else {
            this.price = price;
        }

        this.guest = guest;
        this.visitDate = LocalDate.now();
    }

    public void displayTicketInfo() {
        System.out.println("======================");
        System.out.println("Ticket info:");
        System.out.println("    price\t\t\t: " + this.price);
        System.out.println("    visitor name\t\t: " + this.guest.getName());
        System.out.println("    visit date\t\t\t: " + this.visitDate);
        System.out.println("======================");
    }

    public void displayTicketInfoShort() {
        System.out.println(
                this.guest.getName() + "\t" + this.guest.getIsVip() + "\t\t" + this.visitDate + "\t" + this.price);
    }

}
