package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternMessure;

public class MultiSensorStationBridge extends MeasurementStationBridge {
    public MultiSensorStationBridge(SensorBridge... sensorBridges) {
        super(sensorBridges);
    }

    @Override
    protected String getStationType() {
        return "Multi-Sensor Station";
    }
}