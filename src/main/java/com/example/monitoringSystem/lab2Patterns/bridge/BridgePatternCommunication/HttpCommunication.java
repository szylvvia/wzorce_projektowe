package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication;

// Concrete Implementor - HTTP Communication
public class HttpCommunication implements CommunicationModule {
    @Override
    public String sendData(String data) {
        return "Sending data over HTTP: " + data + "<br>";
    }
}
