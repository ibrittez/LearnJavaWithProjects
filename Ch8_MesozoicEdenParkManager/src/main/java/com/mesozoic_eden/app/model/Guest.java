package com.mesozoic_eden.app.model;

public class Guest {
    private String name;
    private boolean isVip;
    private boolean hasTicket = false;

    public Guest(String name, boolean isVip) {
        this.name = name;
        this.isVip = isVip;
    }

    /*
     * ==================
     * [GETTERS]
     * ==================
     */

    public String getName() {
        return this.name;
    }

    public boolean getIsVip() {
        return this.isVip;
    }

    public boolean getHasTicket() {
        return this.hasTicket;
    }

    /*
     * ==================
     * [SETTERS]
     * ==================
     */

    public void setHasTicket(boolean hasTicket) {
        this.hasTicket = hasTicket;
    }

    /*
     * ==================
     * [UTILS]
     * ==================
     */

    void displayEmployeeInfo() {
        System.out.println("======================");
        System.out.println("Guest info:");
        System.out.println("    name:\t\t" + this.name);
        System.out.println("    VIP:\t\t" + this.isVip);
        System.out.println("    Ticket:\t\t" + this.hasTicket);
        System.out.println("======================");
    }

}
