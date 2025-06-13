package com.example.monitoringSystem.lab6.ocpAbstract2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja czujnika temperatury
//Dodaje nową funkcjonalność pomiaru temperatury bez zmiany istniejącego kodu systemu
//Demonstruje jak OCP umożliwia rozszerzanie hierarchii czujników o nowe typy
public class TemperatureSensor extends ASensor {
    private double temperature;
    private String name;

    public TemperatureSensor(double temperature, String name) {
        this.temperature = temperature;
        this.name = name;
    }

    @Override
    public void measure() {
        System.out.println("Measuring temperature: " + temperature + " " + name);
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating temperature sensor for: " + name);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getUnit() {
        return name;
    }

    public void setUnit(String unit) {
        this.name = unit;
    }
}
//Koniec, Tydzień 7, Zasada OCP - czujnik temperatury
