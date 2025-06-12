package com.example.monitoringSystem.lab2Patterns.composite;

//Tydzień 3, Wzorzec Composite, liść w hierarchii reprezentujący czujnik temperatury bez podczujników
public class TemperatureSensorComposite implements SensorComposite {
    private String name;
    private Double temperature;

    public TemperatureSensorComposite(String name, Double temperature) {
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
    public void setTemperature(Double temperature) { this.temperature = temperature; }    public void setName(String name) { this.name = name; }

}
//Koniec, Tydzień 3, Wzorzec Composite
