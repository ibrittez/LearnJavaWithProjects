package com.mesozoic_eden.dinosaur;

public class Dinosaurios {
    public static void DinosauriosPresentar(String breed, float height, float length, float weight) {
        System.out.println("Dinosaurio  :");
        System.out.println("Raza        : " + breed);
        System.out.println("Altura      : " + height + " m");
        System.out.println("Largo       : " + length + " m");
        System.out.println("Peso        : " + weight + " kg");
    }

    public static void DinosauriosProfileGenerator(String name, int age, String species, Boolean isCarnivore,
            float weight) {

        String diet;

        if (isCarnivore == true) {
            diet = "carnivore";
        } else {
            diet = "hervivore";
        }
        System.out.println("Meet " + name + ", a " + age + "-year-old " + species + ". As a " + diet
                + ", it has a robust weight of " + weight + " kilograms.");
    }

    public static void DinosauriosMealPlanner(double weight, double ratioWeightFood, int numberOfFeedings) {
        double foodPerDay = weight + ratioWeightFood;
        double foodPerFeeding = foodPerDay / numberOfFeedings;

        System.out.println("Our " + weight + " kg dinosaur needs to eat " + foodPerDay + " kg daily, which means we " +
                "need to serve " + foodPerFeeding + " kg per feeding.");
    }

    public static void DinosauriosRolDeEmpleado(String currentRole, int currentTime24h, double safetyRating) {
        System.out.println("Current role: " + currentRole);
        System.out.println("Current time: " + currentTime24h);
        System.out.println("Current safety rating: " + safetyRating);
        System.out.println("Searching for new tasks ...");

        switch (currentRole) {
            case "Feeding" -> {
                if (currentTime24h <= 19 && currentTime24h > 8) {
                    System.out.println("Your task is: Feeding");
                } else {
                    System.out.println("Feeding time ended, reasigning new task");
                }
            }
            case "Cleaning" -> {
                System.out.println("Your task is: Cleaning");
            }
            case "Security" -> {
                if (safetyRating < 7.5) {
                    System.out.println("Alert! low safety rating. Increase survilance");

                } else {
                    System.out.println("Your task is: Security");
                }
            }
            case "Tour guiding" -> {
                if (currentTime24h <= 19 && currentTime24h > 9) {
                    System.out.println("Your task is: Tour guiding");
                } else {
                    System.out.println("Tour guiding time ended, you can return home.");
                }
            }
            default -> {
                System.out.println("Unknown job title.");
            }

        }
    }

    public static void DinosauriosFoodSchedule() {
        final int TREX_TIME_MORNING = 8;
        final int TREX_TIME_NOON = 14;
        final int TREX_TIME_EVENING = 20;
        final int BRACHIO_TIME_MORNING = 7;
        final int BRACHIO_TIME_NOON = 15;
        final int BRACHIO_TIME_EVENING = 19;

        int currentTime = 0;

        String brachio = "Brachiosaurus";
        int brachioFood = 250;

        String trex = "T-Rex";
        int trexFood = 100;

        while (currentTime <= 23) {
            if (currentTime == BRACHIO_TIME_MORNING) {
                System.out.println(GenerateFeedingSentence(currentTime, brachio, brachioFood));
            } else if (currentTime == TREX_TIME_MORNING) {
                System.out.println(GenerateFeedingSentence(currentTime, trex, trexFood));
            } else if (currentTime == TREX_TIME_NOON) {
                System.out.println(GenerateFeedingSentence(currentTime, trex, trexFood));
            } else if (currentTime == BRACHIO_TIME_NOON) {
                System.out.println(GenerateFeedingSentence(currentTime, brachio, brachioFood));
            } else if (currentTime == TREX_TIME_EVENING) {
                System.out.println(GenerateFeedingSentence(currentTime, trex, trexFood));
            } else if (currentTime == BRACHIO_TIME_EVENING) {
                System.out.println(GenerateFeedingSentence(currentTime, brachio, brachioFood));
            }

            currentTime++;
        }
    }

    static String GenerateFeedingSentence(int time, String dino, int food) {
        return "It's " + time + ":00 " + "-" + " Feeding time for " + dino + " with " + food + "kg of food.";
    }

}
