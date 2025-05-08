package com.example.monitoringSystem.lab7.dip.dipK;

public class MonitoringService {
    private final DataTransmitter transmitter;

    public MonitoringService(DataTransmitter transmitter) {
        this.transmitter = transmitter;
    }

    public void sendData(String reading) {
        transmitter.transmit(reading);
    }
}

