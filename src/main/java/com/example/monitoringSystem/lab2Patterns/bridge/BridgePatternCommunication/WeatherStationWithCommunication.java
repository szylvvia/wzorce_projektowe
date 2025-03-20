package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication;

// Concrete Abstraction - Weather Station with Communication
public class WeatherStationWithCommunication extends CommunicatingMeasurementStation {
    public WeatherStationWithCommunication(CommunicationModule communicationModule) {
        super(communicationModule);
    }

    @Override
    public String measureAndSend() {
        String measurementData = "Temperature: 24°C, Humidity: 60%";
        return "Weather Station measuring data...<br>" + communicationModule.sendData(measurementData);
    }
}

