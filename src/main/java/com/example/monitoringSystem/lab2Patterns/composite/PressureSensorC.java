package com.example.monitoringSystem.lab2Patterns.composite;

public class PressureSensorC implements SensorC {
    private String name;
    private Double pressure;

    public PressureSensorC(String name, Double pressure) {
        this.name = name;
        this.pressure = pressure;
    }

    @Override
    public String getDetails() {
        return "Czujnik ciśnienia: " + " " + getName();
    }

    @Override
    public void showMeasurement() {
        System.out.println("Pobieranie danych z czujnika ciśnienia... \n Ciśnienie: " + getPressure());
    }

    @Override
    public void reset() {
        System.out.println("Resetowanie czujnika cisnienia...");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }
    public Double getPressure() { return pressure; }
    public void setPressure(Double pressure) { this.pressure = pressure; }


}
