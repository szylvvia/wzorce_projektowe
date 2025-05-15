package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

// Extended abstraction - Industrial Station
public class IndustrialStationBridge extends MeasurementStationBridge {
    public IndustrialStationBridge(SensorBridge... sensorBridges) {
        super(sensorBridges);
    }

    @Override
    protected String getStationType() {
        return "Industrial Station";
    }
}
