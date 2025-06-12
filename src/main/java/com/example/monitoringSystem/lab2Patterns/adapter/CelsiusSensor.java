package com.example.monitoringSystem.lab2Patterns.adapter;

//Tydzień 3, Sensor Celsiusza dla wzorca Adapter
//Konkretna implementacja sensora temperatury w stopniach Celsjusza
//Adaptee w wzorcu Adapter - istniejący kod wymagający adaptacji
public class CelsiusSensor implements TemperatureSensor {
    public double getTemperature() {
        return 25.0;
    }
}
//Koniec, Tydzień 3, Sensor Celsiusza
