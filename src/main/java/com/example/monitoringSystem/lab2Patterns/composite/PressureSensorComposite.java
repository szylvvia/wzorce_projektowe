package com.example.monitoringSystem.lab2Patterns.composite;

//Tydzień 3, Wzorzec Composite, liść w hierarchii reprezentujący czujnik ciśnienia bez podczujników
public class PressureSensorComposite implements SensorComposite {
    private String name;
    private Double pressure;

    public PressureSensorComposite(String name, Double pressure) {
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
    public Double getPressure() { return pressure; }    public void setPressure(Double pressure) { this.pressure = pressure; }


}
//Koniec, Tydzień 3, Wzorzec Composite
