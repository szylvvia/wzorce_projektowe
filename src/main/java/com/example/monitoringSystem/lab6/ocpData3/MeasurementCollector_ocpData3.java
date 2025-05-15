package com.example.monitoringSystem.lab6.ocpData3;

public class MeasurementCollector_ocpData3 {
    public Measurement_ocpData3 collect() {
        double temp = 15 + Math.random() * 10;
        double humidity = 50 + Math.random() * 30;
        return new Measurement_ocpData3(temp, humidity);
    }
}
