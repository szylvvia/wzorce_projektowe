package com.example.monitoringSystem.lab7.dip.dipK;

public abstract class AbstractDataTransmitter implements DataTransmitter {
    protected String endpoint;

    public AbstractDataTransmitter(String endpoint) {
        this.endpoint = endpoint;
    }

    public abstract void transmit(String data);
}
