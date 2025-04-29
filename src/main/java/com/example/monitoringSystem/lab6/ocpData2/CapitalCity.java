package com.example.monitoringSystem.lab6.ocpData2;

public class CapitalCity implements ICity{
    private String name;

    public CapitalCity(String name) {
        this.name = name;
    }

    @Override
    public void checkWeather() {
        double temperature = Math.random() * 40;
        System.out.println("[CITY] Temperature in " + name + ": " + temperature + "°C");
    }
}
