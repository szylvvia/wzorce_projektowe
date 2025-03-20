package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication;

// Abstraction - Measurement Station with Communication
public abstract class CommunicatingMeasurementStation {
    protected CommunicationModule communicationModule;

    public CommunicatingMeasurementStation(CommunicationModule communicationModule) {
        this.communicationModule = communicationModule;
    }
    public abstract String measureAndSend();
}
