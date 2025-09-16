package com.mesozoic_eden.app;
import com.mesozoic_eden.dinosaur.Saludos;
import com.mesozoic_eden.dinosaur.Dinosaurios;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Saludos.SaludosBienvenida();
        Saludos.SaludosHorarios();
        Saludos.SaludosAdvertencia();

        Dinosaurios.DinosauriosPresentar("T-rex", 2.123f, 8.3f, 2537.86f);

        Dinosaurios.DinosauriosProfileGenerator("Puppy", 679, "T-rex", true, 658.9f);

        Dinosaurios.DinosauriosMealPlanner(2000.0, 0.05, 2);

        Dinosaurios.DinosauriosRolDeEmpleado("Feeding", 10, 10.0);
        Dinosaurios.DinosauriosRolDeEmpleado("Feeding", 23, 10.0);
        Dinosaurios.DinosauriosRolDeEmpleado("Tour guiding", 23, 10.0);
        Dinosaurios.DinosauriosRolDeEmpleado("Security", 10, 10.0);
        Dinosaurios.DinosauriosRolDeEmpleado("Security", 10, 3.0);
        Dinosaurios.DinosauriosFoodSchedule();
        Dinosaurios.DinosauriosDinoTracker();
    }
}
