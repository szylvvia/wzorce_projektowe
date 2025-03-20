package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication;

// Concrete Abstraction - Industrial Station with Communication
public class IndustrialStationWithCommunication extends CommunicatingMeasurementStation {
    public IndustrialStationWithCommunication(CommunicationModule communicationModule) {
        super(communicationModule);
    }

    @Override
    public String measureAndSend() {
        String measurementData = "Gas Levels: Safe, Noise: Moderate";
        return "Industrial Station measuring data...<br>" + communicationModule.sendData(measurementData);
    }
}


