package com.example.monitoringSystem.lab8.predicateFunction;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
        Predicate<Double> isDangerousTemperature = temp -> temp < 0 || temp > 35;
        Function<Double, String> dangerLevel = temp -> {
            if (temp < 0) return "Freezing";
            else if (temp > 35) return "Overheat";
            else return "Normal";
        };

        double testTemp = 38.6;

        if (isDangerousTemperature.test(testTemp)) {
            System.out.println("Alert! Temperature is dangerous: " + dangerLevel.apply(testTemp));
        } else {
            System.out.println("Temperature is safe: " + dangerLevel.apply(testTemp));
        }
    }
}
