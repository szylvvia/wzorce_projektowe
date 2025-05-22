package com.example.monitoringSystem.lab8.functional.example1;

@FunctionalInterface
public interface AlertFormatter {
    String format(String message, double value);
}
