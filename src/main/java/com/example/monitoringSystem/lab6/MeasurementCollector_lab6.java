package com.example.monitoringSystem.lab6;

public class MeasurementCollector_lab6 {

    public Measurement_lab6 collect() {
        double temp = Math.random() * 30;
        double humidity = Math.random() * 100;
        double pressure = 1000 + Math.random() * 20;

        return new Measurement_lab6(temp, humidity, pressure);
    }
}

