package com.example.monitoringSystem.lab7.dip.dipK;

public class HttpDataTransmitter extends AbstractDataTransmitter {
    public HttpDataTransmitter(String endpoint) {
        super(endpoint);
    }

    @Override
    public void transmit(String data) {
        System.out.println("Transmitting via HTTP to " + endpoint + ": " + data);
    }
}

