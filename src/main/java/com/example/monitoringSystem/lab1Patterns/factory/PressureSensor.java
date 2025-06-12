package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Sensor ciśnienia dla wzorca Factory
//Implementacja sensora ciśnienia jako produktu fabryki
//Część rodziny sensorów tworzonych przez wzorzec Factory
public class PressureSensor implements SensorF {
    @Override
    public String getDetails() {
        return "Czujnik ciśnienia";
    }
}
//Koniec, Tydzień 2, Sensor ciśnienia dla wzorca Factory
