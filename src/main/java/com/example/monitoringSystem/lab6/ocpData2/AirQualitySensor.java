//Tydzień 7, Zasada OCP (Open/Closed Principle), czujnik jakości powietrza
//Nowa implementacja czujnika dodana bez modyfikacji istniejącego kodu systemu
//Demonstruje rozszerzalność systemu sensorów zgodnie z zasadą OCP
package com.example.monitoringSystem.lab6.ocpData2;

public class AirQualitySensor implements ISensor {
    private final String location;

    public AirQualitySensor(String location) {
        this.location = location;
    }

    @Override
    public void readMeasurement() {
        int valueMultiplier = 100;
        double value = Math.random() * valueMultiplier;
        System.out.println("[SENSOR] Air Quality Sensor at " + location + " read value: " + value);
    }
}
//Koniec, Tydzień 7, Zasada OCP - czujnik jakości powietrza
