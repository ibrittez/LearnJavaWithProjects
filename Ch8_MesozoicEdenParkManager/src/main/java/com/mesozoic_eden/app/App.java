package com.mesozoic_eden.app;

import com.mesozoic_eden.app.park.Park;
import java.util.Scanner;

public class App {
    public Scanner scanner = new Scanner(System.in);
    public Park mesoEden = new Park("Mesozoic Eden");

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {
        Menus menus = new Menus(scanner, mesoEden);
        while (true) {
            menus.displayMainMenu();
            int choice = scanner.nextInt();
            menus.handleMainMenuChoice(choice);
        }
    }

}
