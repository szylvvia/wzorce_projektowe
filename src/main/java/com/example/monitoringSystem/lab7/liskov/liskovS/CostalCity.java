package com.example.monitoringSystem.lab7.liskov.liskovS;

public class CostalCity extends City {

    public CostalCity(String name) {
        super(name);
    }

    @Override
    public void updateWeather() {
        System.out.println("[COSTAL] Zaktualizowanie pogody w mieście nadmorskim: " + getName());
    }
}
