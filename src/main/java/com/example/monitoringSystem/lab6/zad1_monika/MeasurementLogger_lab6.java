package com.example.monitoringSystem.lab6.zad1_monika;

import java.io.FileWriter;
import java.io.IOException;

public class MeasurementLogger_lab6 {

    public void log(Measurement_lab6 measurement) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(measurement.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku: " + e.getMessage());
        }
    }
}


