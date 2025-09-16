package com.mesozoic_eden.dinosaur;

public class Saludos {
    public static void SaludosBienvenida() {
        System.out.println("Bienvenido al parque jurasico");
    }

    public static void SaludosHorarios() {
        String apertura = "08:00";
        String clausura = "21:00";

        System.out.println("Los horarios son: " + apertura + " - " + clausura + ".");
    }

    public static void SaludosAdvertencia() {
        System.out.println("Cuidado con el T-Rex");
    }

}
