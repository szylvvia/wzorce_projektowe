package com.example.monitoringSystem.lab6.ocpData2;

import java.util.ArrayList;
import java.util.List;

public class AglomerationCity implements ICity{
    private String name;

    public AglomerationCity(String name) {
        this.name = name;
    }

    @Override
    public void checkWeather() {
        System.out.print("[CITY] Temperatures in " + name + ": ");
        for (int i = 0; i < 3; i++) {
           System.out.print((Math.random() * 40) + "°C, ");
        }
        System.out.println();
    }
}
