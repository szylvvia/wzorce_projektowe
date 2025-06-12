package com.example.monitoringSystem.lab2Patterns.composite;

import java.sql.Time;
import java.time.LocalDate;

//Tydzień 3, Wzorzec Composite, liść w hierarchii reprezentujący pojedynczy pomiar środowiskowy
public class Measurement implements TimeInterval{
    private LocalDate date;
    private String pollutionLevel;
    private double temperature;
    private double humidity;
    private double pressure;


    public Measurement(LocalDate date, String pollutionLevel, double temperature, double humidity, double pressure) {
        this.date = date;
        this.pollutionLevel = pollutionLevel;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }    @Override
    public void showMeasurement() {
        System.out.println("Time: " + date + " Pollution level: " + pollutionLevel + " Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
//Koniec, Tydzień 3, Wzorzec Composite
