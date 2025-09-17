package com.mesozoic_eden.app.handlers;

import java.util.Scanner;

import com.mesozoic_eden.app.park.Park;

public class DinoHandler {
    Scanner scanner;
    Park park;

    public DinoHandler(Scanner scanner, Park park) {
        this.scanner = scanner;
        this.park = park;
    }
}
