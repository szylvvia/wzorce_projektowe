package com.example.monitoringSystem.lab9.AspectJ1;

import com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation;

public class Main {
    public static void main(String[] args) {
        MeasurementStation station = new MeasurementStation();
        System.out.println("Temperature: " + station.getTemperature());
        System.out.println("Humidity: " + station.getHumidity());
    }
}
