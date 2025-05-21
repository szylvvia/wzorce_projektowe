package com.example.monitoringSystem.lab2Patterns.adapter;

public class AdapterTester {
    public static void main(String[] args) {
        System.out.println("=== TemperatureUnitAdapter Tests ===");
        int celsiusTemperaturePositive = 25;
        try {
            TemperatureUnitAdapter temp = new TemperatureUnitAdapter(celsiusTemperaturePositive);
            System.out.println("Celsius to Fahrenheit: " + temp.toFahrenheit());
            System.out.println("Celsius to Kelvin: " + temp.toKelvin());
            System.out.println("Celsius to Rankine (unsupported): " + temp.toRankine());
        } catch (RuntimeException e) {
            System.out.println("Temperature EXCEPTION: " + e.getMessage());
        }

        int celsiusTemperatureNegative = -300;
        try {
            new TemperatureUnitAdapter(celsiusTemperatureNegative); // below absolute zero
        } catch (RuntimeException e) {
            System.out.println("Temperature EXCEPTION: " + e.getMessage());
        }

        int windSpeedPositiveInKilometers = 100;
        System.out.println("\n=== MphWindAdapter Tests ===");
        try {
            MphWindAdapter wind = new MphWindAdapter(windSpeedPositiveInKilometers);
            System.out.println("Wind km/h to mph: " + wind.toMph());
            System.out.println("Wind to knots (unsupported): " + wind.toKnots());
        } catch (RuntimeException e) {
            System.out.println("Wind EXCEPTION: " + e.getMessage());
        }

        int windSpeedNegativeInKilometers = -10;
        try {
            new MphWindAdapter(windSpeedNegativeInKilometers); // invalid
        } catch (RuntimeException e) {
            System.out.println("Wind EXCEPTION: " + e.getMessage());
        }

        int windSpeedExceedsLimit = 500;
        try {
            new MphWindAdapter(windSpeedExceedsLimit); // exceeds realistic limit
        } catch (RuntimeException e) {
            System.out.println("Wind EXCEPTION: " + e.getMessage());
        }

        double pressurePositiveInHpa = 1013.25;
        System.out.println("\n=== MmHgPressureAdapter Tests ===");
        try {
            MmHgPressureAdapter pressure = new MmHgPressureAdapter(pressurePositiveInHpa);
            System.out.println("Pressure hPa to mmHg: " + pressure.toMmHg());
            System.out.println("Pressure to PSI (unsupported): " + pressure.toPsi());
        } catch (RuntimeException e) {
            System.out.println("Pressure EXCEPTION: " + e.getMessage());
        }

        double pressureNegativeInHpa = -50;
        try {
            new MmHgPressureAdapter(pressureNegativeInHpa); // invalid
        } catch (RuntimeException e) {
            System.out.println("Pressure EXCEPTION: " + e.getMessage());
        }

        double pressureExceedsLimit = 2500;
        try {
            new MmHgPressureAdapter(pressureExceedsLimit); // too high
        } catch (RuntimeException e) {
            System.out.println("Pressure EXCEPTION: " + e.getMessage());
        }
    }
}
