package com.example.monitoringSystem.lab2Patterns.adapter;

public class AdapterTester {
    public static void main(String[] args) {
        System.out.println("=== TemperatureUnitAdapter Tests ===");
        try {
            TemperatureUnitAdapter temp = new TemperatureUnitAdapter(25);
            System.out.println("Celsius to Fahrenheit: " + temp.toFahrenheit());
            System.out.println("Celsius to Kelvin: " + temp.toKelvin());
            System.out.println("Celsius to Rankine (unsupported): " + temp.toRankine());
        } catch (RuntimeException e) {
            System.out.println("Temperature EXCEPTION: " + e.getMessage());
        }

        try {
            new TemperatureUnitAdapter(-300); // below absolute zero
        } catch (RuntimeException e) {
            System.out.println("Temperature EXCEPTION: " + e.getMessage());
        }

        System.out.println("\n=== MphWindAdapter Tests ===");
        try {
            MphWindAdapter wind = new MphWindAdapter(100);
            System.out.println("Wind km/h to mph: " + wind.toMph());
            System.out.println("Wind to knots (unsupported): " + wind.toKnots());
        } catch (RuntimeException e) {
            System.out.println("Wind EXCEPTION: " + e.getMessage());
        }

        try {
            new MphWindAdapter(-10); // invalid
        } catch (RuntimeException e) {
            System.out.println("Wind EXCEPTION: " + e.getMessage());
        }

        try {
            new MphWindAdapter(500); // exceeds realistic limit
        } catch (RuntimeException e) {
            System.out.println("Wind EXCEPTION: " + e.getMessage());
        }

        System.out.println("\n=== MmHgPressureAdapter Tests ===");
        try {
            MmHgPressureAdapter pressure = new MmHgPressureAdapter(1013.25);
            System.out.println("Pressure hPa to mmHg: " + pressure.toMmHg());
            System.out.println("Pressure to PSI (unsupported): " + pressure.toPsi());
        } catch (RuntimeException e) {
            System.out.println("Pressure EXCEPTION: " + e.getMessage());
        }

        try {
            new MmHgPressureAdapter(-100); // invalid
        } catch (RuntimeException e) {
            System.out.println("Pressure EXCEPTION: " + e.getMessage());
        }

        try {
            new MmHgPressureAdapter(2500); // too high
        } catch (RuntimeException e) {
            System.out.println("Pressure EXCEPTION: " + e.getMessage());
        }
    }
}
