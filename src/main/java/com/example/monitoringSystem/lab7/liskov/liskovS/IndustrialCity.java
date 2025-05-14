package com.example.monitoringSystem.lab7.liskov.liskovS;

public class IndustrialCity extends City {

    public IndustrialCity(String name) {
        super(name);
    }

    @Override
    public void updateWeather() {
        System.out.println("[INDUSTRIAL] Updated weather in " + getName() + "....");
    }

}
