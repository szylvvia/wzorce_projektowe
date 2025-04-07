package com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy;

public class HttpTransmissionStrategy implements TransmissionStrategy {
    @Override
    public String transmit(String data) {
        return "Data transmitted via HTTP: " + data;
    }
}
