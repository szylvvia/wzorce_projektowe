package com.example.monitoringSystem.lab1Patterns.factory;

//Tydzień 2, Wzorzec Factory 1
//Implementacja wzorca Factory do tworzenia różnych typów sensorów
//Umożliwia tworzenie obiektów bez określania konkretnej klasy
public class SensorFactory {
    public static SensorF createSensor(String type) {
        switch(type) {
            case "Temperature":
                return new TemperatureSensor();
            case "Humidity":
                return new HumiditySensor();
            case "Pressure":
                return new PressureSensor();
            default:                throw new IllegalArgumentException("Nieznany typ sensora");
        }
    }
}
//Koniec, Tydzień 2, Wzorzec Factory 1
