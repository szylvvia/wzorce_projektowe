package com.example.monitoringSystem.lab6.ocpData2;

public class CapitalCity implements ICity{
    private String name;

    public CapitalCity(String name) {
        this.name = name;
    }

    @Override
    public void checkWeather() {
        int temperatureMultiplier = 40;
        double temperature = Math.random() * temperatureMultiplier;
        System.out.println("[CITY] Temperature in " + name + ": " + temperature + "°C");
    }
}
