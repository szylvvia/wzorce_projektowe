package com.example.monitoringSystem.lab2Patterns.composite;

public class TemperatureSensorC implements SensorC {
    private String name;
    private Double temperature;

    public TemperatureSensorC(String name, Double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getDetails() {
        return "Czujnik tempertury: " + getName();
    }

    @Override
    public void showMeasurement() {
        System.out.println("Pobieranie danych z czujnika temperatury...\n Temperatura: " + getTemperature());
    }

    @Override
    public void reset() {
        System.out.println("Resetowanie czujnika temperatury...");
    }

    public String getName() { return name; }
    public Double getTemperature() { return temperature; }
    public void setTemperature(Double temperature) { this.temperature = temperature; }
    public void setName(String name) { this.name = name; }

}
