package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Implementacja sensora temperatury dla wzorca Factory
//Konkretny produkt tworzony przez SensorFactory
//Implementuje interfejs SensorF dla spójności z innymi sensorami
public class TemperatureSensor implements SensorF {
    @Override
    public String getDetails() {
        return "Czujnik temperatury";
    }
}
//Koniec, Tydzień 2, Implementacja sensora temperatury
