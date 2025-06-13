package com.example.monitoringSystem.lab8.functional.example3;

//Tydzień 10, Functional Programming, Demo niestandardowych interfejsów funkcyjnych dla stacji pomiarowych
public class CustomFunctionalInterfacesDemo {
    public static void main(String[] args) {
        // Logger z lambdą
        StationLogger logger = (name, val) -> System.out.println("[" + name + "] -> " + val + " units");

        int zero = 0;
        double North = 24.5;

        logger.log("North", North);

        // Kalkulator z lambdą (średnia)
        StationCalculator avgCalc = values -> {
            double sum = zero;
            for (double v : values) sum += v;
            return values.length > zero ? sum / values.length : zero;
        };

        double average = avgCalc.calculate(new double[]{20.5, 22.0, 24.1});
        System.out.println("Average: " + average);//22.2

        // Filtr nazw stacji
        StationFilter filter = name -> name.startsWith("C");

        System.out.println("Include 'Central'? " + filter.shouldInclude("Central")); // true
        System.out.println("Include 'North'? " + filter.shouldInclude("North")); // false
    }
}
//Koniec, Tydzień 10, Functional Programming
