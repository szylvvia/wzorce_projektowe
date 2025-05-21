package com.example.monitoringSystem.lab8.functional;

@FunctionalInterface
public interface AlertFormatter {
    String format(String message, double value);
}
