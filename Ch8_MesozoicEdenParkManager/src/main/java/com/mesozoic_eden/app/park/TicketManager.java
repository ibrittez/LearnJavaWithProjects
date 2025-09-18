package com.mesozoic_eden.app.park;

import com.mesozoic_eden.app.model.Ticket;

public class TicketManager {
    private Ticket[] tickets;
    private int ticketCount = 0;
    private final int TICKET_MAX = 100;

    public TicketManager() {
        this.tickets = new Ticket[TICKET_MAX];
    }

    public void add(Ticket ticket) {
        if (ticketCount >= TICKET_MAX) {
            System.out.println("ERROR: Park is full");
            return;
        }
        tickets[ticketCount++] = ticket;
    }

    public void remove(Ticket ticket) {
        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i].equals(ticket)) {
                for (int j = i + 1; j < ticketCount; j++) {
                    tickets[j - 1] = tickets[j];
                }
                ticketCount--;
                return;
            }
        }
        System.out.println("ERROR: Employee not found");
    }

    public void displayAll() {
        if (ticketCount == 0) {
            System.out.println("[WARNING]: No employees");
            return;
        }

        System.out.println("ID \tGuest name \tVIP Status \tTicket date \tPrice");
        for (int i = 0; i < ticketCount; i++) {
            System.out.print(i + "\t");
            tickets[i].displayTicketInfoShort();
        }
    }

    public void removeFromIndex(int index) {
        if (!validateIndex(index)) {
            return;
        }

        remove(tickets[index]);
    }

    private boolean validateIndex(int index) {
        if (ticketCount == 0) {
            System.out.println("[WARNING]: No tickets");
            return false;
        }

        if (index < 0 || index >= ticketCount) {
            System.out.println("[ERROR]: Invalid index");
            return false;
        }

        return true;
    }
}
