//Tydzień 3, Wzorzec Bridge - interfejs implementacji sensora
//Definiuje kontraktoperacji zbierania danych przez różne typy sensorów
//Implementacja w wzorcu Bridge - oddzielona od abstrakcji stacji pomiarowej
package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Sensor interface - defines how sensors collect data
public interface SensorBridge {
    String collectData();
}
//Koniec, Tydzień 3, Wzorzec Bridge - interfejs implementacji

