package com.example.monitoringSystem.lab2Patterns.composite;

import java.sql.Time;
import java.time.LocalDate;

public class Measurement implements TimeInterval{
    private LocalDate date;
    private String pollutionLevel;
    private String temperature;
    private String humidity;
    private String pressure;


    public Measurement(LocalDate date, String pollutionLevel, String temperature, String humidity, String pressure) {
        this.date = date;
        this.pollutionLevel = pollutionLevel;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void showMeasurement() {
        System.out.println("Time: " + date + " Pollution level: " + pollutionLevel + " Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
