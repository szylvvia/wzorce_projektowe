package com.example.monitoringSystem.lab8.predicateFunction;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
        // EXAMPLE 1: Using Predicate and Function to check temperature
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

        System.out.println("-------------------------------------------------");

        // EXAMPLE 2: Using Predicate and Function to check date
        long millisInYear = 1000L * 60 * 60 * 24 * 365;
        int mediumRiskYearThreshold = 20;

        Predicate<Date> isDateInFuture = date -> date.after(new Date());

        Function<Date, String> riskOfGlobalWarming = date -> {
            long diffInMillies = date.getTime() - new Date().getTime();
            long diffInYears = diffInMillies / millisInYear;

            if (diffInYears <= 0) return "LOW";
            else if (diffInYears > mediumRiskYearThreshold) return "MEDIUM";
            else return "HIGH";
        };

        long fiveYears = 5L;
        long thirtyYears = 30L;
        long eightyYears = 80L;

        Date highRiskDate = new Date(System.currentTimeMillis() + (fiveYears * millisInYear));
        Date mediumRiskDate = new Date(System.currentTimeMillis() + (thirtyYears * millisInYear));
        Date lowRiskDate = new Date(System.currentTimeMillis() - (eightyYears * millisInYear));

        checkDateAndRiskOfGlobalWarming(highRiskDate, isDateInFuture, riskOfGlobalWarming);
        checkDateAndRiskOfGlobalWarming(mediumRiskDate, isDateInFuture, riskOfGlobalWarming);
        checkDateAndRiskOfGlobalWarming(lowRiskDate, isDateInFuture, riskOfGlobalWarming);
    }

    public static void checkDateAndRiskOfGlobalWarming(Date date, Predicate<Date> isDateInFuture, Function<Date, String> riskOfGlobalWarming) {
        if (isDateInFuture.test(date)) {
            System.out.println("[ !!! ] The date is in the future. " +
                    "Risk of global warming: " + riskOfGlobalWarming.apply(date));
        } else {
            System.out.println("[  ✓  ] The date is not in the future. " +
                    "Risk of global warming: " + riskOfGlobalWarming.apply(date));
        }
    }
}
