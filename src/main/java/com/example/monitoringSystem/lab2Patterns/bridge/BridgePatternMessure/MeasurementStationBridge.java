package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;


import java.util.ArrayList;
import java.util.List;

// Tydzień 3, Wzorzec Bridge - abstrakcja stacji pomiarowej
// Definiuje interfejs wysokiego poziomu dla stacji pomiarowych
// Przechowuje referencję do implementacji (SensorBridge) i deleguje do niej operacje
// Abstraction - Measurement Station
public abstract class MeasurementStationBridge {
    protected List<SensorBridge> sensorBridges = new ArrayList<>();

    public MeasurementStationBridge(SensorBridge... sensorBridges) {
        for (SensorBridge sensorBridge : sensorBridges) {
            this.sensorBridges.add(sensorBridge);
        }
    }

    public String measure() {
        StringBuilder result = new StringBuilder(getStationType() + " starting measurements...<br>");
        for (SensorBridge sensorBridge : sensorBridges) {
            result.append(sensorBridge.collectData()).append("<br>");
        }
        return result.toString();
    }

    protected abstract String getStationType();
}
// Koniec, Tydzień 3, Wzorzec Bridge - abstrakcja