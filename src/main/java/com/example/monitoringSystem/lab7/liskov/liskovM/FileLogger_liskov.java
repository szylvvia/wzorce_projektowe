package com.example.monitoringSystem.lab7.liskov.liskovM;

public class FileLogger_liskov extends DataLogger_liskov {
    @Override
    public void log(double value) {
        System.out.println("Zapisuję wartość do pliku: " + value);
    }
}