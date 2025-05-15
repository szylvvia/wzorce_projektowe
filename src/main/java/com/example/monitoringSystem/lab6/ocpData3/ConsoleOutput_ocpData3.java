package com.example.monitoringSystem.lab6.ocpData3;

public class ConsoleOutput_ocpData3 implements MeasurementOutput_ocpData3 {
    @Override
    public void output(String formattedData) {
        System.out.println("OUTPUT: " + formattedData);
    }
}
