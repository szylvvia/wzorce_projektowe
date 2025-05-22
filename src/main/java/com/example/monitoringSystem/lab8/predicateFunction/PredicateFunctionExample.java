package com.example.monitoringSystem.lab8.predicateFunction;

import java.util.function.Function;
import java.util.function.Predicate;

// Moniki

public class PredicateFunctionExample {
    static int lowPressure = 1005;
    static int veryLowPressure = 1000;


    public static void main(String[] args) {
        Predicate<Integer> isLowPressure = p -> p < lowPressure;
        Function<Integer, String> pressureCategory = p -> {
            if (p < veryLowPressure) return "Very Low";
            else if (p < lowPressure) return "Low";
            else return "Normal";
        };

        int currentPressure = 1002;

        if (isLowPressure.test(currentPressure)) {
            System.out.println("Alert! Pressure too low: " + pressureCategory.apply(currentPressure));
        } else {
            System.out.println("Pressure OK: " + pressureCategory.apply(currentPressure));
        }
    }
}
