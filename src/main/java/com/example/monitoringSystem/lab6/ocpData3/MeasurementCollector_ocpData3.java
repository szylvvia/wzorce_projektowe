package com.example.monitoringSystem.lab6.ocpData3;

public class MeasurementCollector_ocpData3 {
    public Measurement_ocpData3 collect() {
        int temperatureOffset = 15;
        int humidityOffset = 50;
        int temperatureRange = 10;
        int humidityRange = 30;

        double temp = temperatureOffset + Math.random() * temperatureRange;
        double humidity = humidityOffset + Math.random() * humidityRange;

        return new Measurement_ocpData3(temp, humidity);
    }
}
