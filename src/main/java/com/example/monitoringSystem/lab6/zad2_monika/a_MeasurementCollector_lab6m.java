package com.example.monitoringSystem.lab6.zad2_monika;

public class a_MeasurementCollector_lab6m {
    public a_Measurement_lab6m collect() {
        double temp = 15 + Math.random() * 10;
        double humidity = 50 + Math.random() * 30;
        return new a_Measurement_lab6m(temp, humidity);
    }
}
