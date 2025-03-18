package com.example.monitoringSystem.lab1Patterns.factory;

public class SensorFactory {
    public static Sensor createSensor(String type) {
        switch(type) {
            case "Temperature":
                return new TemperatureSensor();
            case "Humidity":
                return new HumiditySensor();
            case "Pressure":
                return new PressureSensor();
            default:
                throw new IllegalArgumentException("Nieznany typ sensora");
        }
    }
}
