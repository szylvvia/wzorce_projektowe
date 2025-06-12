package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Sensor wilgotności dla wzorca Factory
//Konkretna implementacja sensora tworzona przez SensorFactory
//Jedna z rodzin produktów w wzorcu Factory Method
public class HumiditySensor implements SensorF {
    @Override
    public String getDetails() {
        return "Czujnik wilgotności";
    }
}
//Koniec, Tydzień 2, Sensor wilgotności dla wzorca Factory
