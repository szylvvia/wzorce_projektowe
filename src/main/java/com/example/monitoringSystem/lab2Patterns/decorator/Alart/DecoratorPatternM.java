package com.example.monitoringSystem.lab2Patterns.decorator.Alart;

// Test the Decorator Pattern
public class DecoratorPatternM {
    public static void main(String[] args) {
        System.out.println("=== Basic Station ===");
        MeasurementStation basicStation = new BasicMeasurementStation();
        basicStation.measure();

        System.out.println("\n=== Station with Logging ===");
        MeasurementStation loggedStation = new LoggingDecorator(new BasicMeasurementStation());
        loggedStation.measure();

        System.out.println("\n=== Station with Alerts ===");
        MeasurementStation alertStation = new AlertDecorator(new BasicMeasurementStation());
        alertStation.measure();

        System.out.println("\n=== Station with Logging and Alerts ===");
        MeasurementStation fullFeatureStation = new LoggingDecorator(new AlertDecorator(new BasicMeasurementStation()));
        fullFeatureStation.measure();
    }
}

