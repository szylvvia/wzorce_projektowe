package com.example.monitoringSystem.lab6.ocpAbstract3;

import java.io.FileWriter;
import java.io.IOException;

public class MeasurementLogger_ocpAbstract3 {

    public void log(Measurement_ocpAbstract3 measurement) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(measurement.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku: " + e.getMessage());
        }
    }
}


