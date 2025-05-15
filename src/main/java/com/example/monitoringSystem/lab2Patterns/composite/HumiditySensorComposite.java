package com.example.monitoringSystem.lab2Patterns.composite;

public class HumiditySensorComposite implements SensorComposite {
    private String name;
    private Double humidity;

    public HumiditySensorComposite(String name, Double humidity) {
        this.name = name;
        this.humidity = humidity;
    }

    @Override
    public String getDetails() {
        return "Czujnik wilgotności: " + getName();
    }

    @Override
    public void showMeasurement() {
        System.out.println("Pobieranie danych z czujnika wilgotności...\n Wilgotność: " + getHumidity());
    }

    @Override
    public void reset() {
        System.out.println("Resetowanie czujnika wilgotności...");
    }

    public String getName() { return name; }
    public Double getHumidity() { return humidity; }
    public void setHumidity(Double humidity) { this.humidity = humidity; }
    public void setName(String name) { this.name = name; }

}
