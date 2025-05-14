package com.example.monitoringSystem.lab7.liskov.liskovS.liskov1;

public class CostalCity extends City {

    public CostalCity(String name) {
        super(name);
    }

    @Override
    public void updateWeather() {
        System.out.println("[COSTAL] Updated weather in " + getName() + "....");
    }
}
