//Tydzień 7, Zasada OCP - klasa reprezentująca próg sensora
//Enkapsuluje dane o wartości progowej dla różnych typów sensorów
//Zgodnie z zasadą Open/Closed może być rozszerzana bez modyfikacji istniejącego kodu
package com.example.monitoringSystem.lab6.ocpData;

public class SensorThreshold {
    private final String sensorType;
    private final double currentValue;
    private final double limit;

    public SensorThreshold(String sensorType, double currentValue, double limit) {
        this.sensorType = sensorType;
        this.currentValue = currentValue;
        this.limit = limit;
    }

    public String getSensorType() {
        return sensorType;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getLimit() {
        return limit;
    }
}
//Koniec, Tydzień 7, Zasada OCP - próg sensora
