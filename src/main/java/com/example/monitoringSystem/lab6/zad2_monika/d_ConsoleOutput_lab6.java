package com.example.monitoringSystem.lab6.zad2_monika;

public class d_ConsoleOutput_lab6 implements d_MeasurementOutput_lab6 {
    @Override
    public void output(String formattedData) {
        System.out.println("OUTPUT: " + formattedData);
    }
}
