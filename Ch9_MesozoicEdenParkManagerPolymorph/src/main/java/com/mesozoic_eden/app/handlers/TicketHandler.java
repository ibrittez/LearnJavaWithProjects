package com.mesozoic_eden.app.handlers;

import java.util.Scanner;

import com.mesozoic_eden.app.model.Guest;
import com.mesozoic_eden.app.model.Ticket;
import com.mesozoic_eden.app.park.Park;

public class TicketHandler {
    Scanner scanner;
    Park park;
    final double ticketPrice = 20.0;

    public TicketHandler(Scanner scanner, Park park) {
        this.scanner = scanner;
        this.park = park;
    }

    public void list() {
        park.getTicketManager().displayAll();
    }

    public void add() {
        scanner.nextLine(); // fflush(stdin)

        String name = readGuestName();

        boolean isVip = readGuestIsVip();

        Ticket ticket = new Ticket(ticketPrice, new Guest(name, isVip));
        park.getTicketManager().add(ticket);
    }

    public void cancel() {
        list();

        scanner.nextLine(); // fflush(stdin)
        System.out.print("Insert the ID of the ticket to be canceled: ");
        int id = scanner.nextInt();

        park.getTicketManager().removeFromIndex(id);
    }

    private String readGuestName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }

    private boolean readGuestIsVip() {
        System.out.print("Guest is VIP: ");
        boolean isVip = scanner.nextBoolean();
        return isVip;
    }
}
