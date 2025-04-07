package com.example.monitoringSystem.lab5Patterns.strategy.DataTransmissionStrategy;

public class DataTransmitter {
    public String sendData(String data, TransmissionStrategy strategy) {
        return strategy.transmit(data);
    }
}