package com.example.monitoringSystem.lab8.predicateFunction;

import java.util.function.Function;
import java.util.function.Predicate;

// Moniki

public class PredicateFunctionExample {
    public static void main(String[] args) {
        Predicate<Integer> isLowPressure = p -> p < 1005;
        Function<Integer, String> pressureCategory = p -> {
            if (p < 1000) return "Very Low";
            else if (p < 1010) return "Low";
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
