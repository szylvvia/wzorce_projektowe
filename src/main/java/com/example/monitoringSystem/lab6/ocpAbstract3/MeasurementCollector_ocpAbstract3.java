package com.example.monitoringSystem.lab6.ocpAbstract3;

public class MeasurementCollector_ocpAbstract3 {

    public Measurement_ocpAbstract3 collect() {
        double temp = Math.random() * 30;
        double humidity = Math.random() * 100;
        double pressure = 1000 + Math.random() * 20;

        return new Measurement_ocpAbstract3(temp, humidity, pressure);
    }
}

