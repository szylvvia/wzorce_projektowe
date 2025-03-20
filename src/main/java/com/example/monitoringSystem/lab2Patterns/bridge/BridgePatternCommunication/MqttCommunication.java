package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication;

// Concrete Implementor - MQTT Communication
public class MqttCommunication implements CommunicationModule {
    @Override
    public String sendData(String data) {
        return "Sending data over MQTT: " + data + "<br>";
    }
}

