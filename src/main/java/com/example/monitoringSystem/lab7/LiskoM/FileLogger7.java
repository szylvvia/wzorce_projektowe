package com.example.monitoringSystem.lab7.LiskoM;

public class FileLogger7 extends DataLogger7 {
    @Override
    public void log(double value) {
        System.out.println("Zapisuję wartość do pliku: " + value);
    }
}