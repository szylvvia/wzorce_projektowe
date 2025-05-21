package com.example.monitoringSystem.lab7.liskov.liskovK;

public class WifiTransmitter extends DataTransmitter {
    @Override
    public void transmitData(String data) {

        System.out.println("Transmitting data over WiFi: " + data);
    }
}
