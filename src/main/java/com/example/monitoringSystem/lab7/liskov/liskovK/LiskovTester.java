package com.example.monitoringSystem.lab7.liskov.liskovK;

public class LiskovTester {
    public static void main(String[] args) {
        System.out.println("=== Liskov Substitution Principle Test ===");

        // === MonitoringStation ===
        MonitoringStation abstractStation = new AirMonitoringStation("Warsaw"); // abstrakcyjnie
        abstractStation.collectData();

        AirMonitoringStation concreteStation = new AirMonitoringStation("Frankfurt"); // konkretnie
        concreteStation.collectData();

        // === DataTransmitter ===
        DataTransmitter abstractTransmitter = new WifiTransmitter(); // abstrakcyjnie
        abstractTransmitter.transmitData("Temperature=24");

        WifiTransmitter concreteTransmitter = new WifiTransmitter(); // konkretnie
        concreteTransmitter.transmitData("Humidity=40");

        // === EventHandler ===
        EventHandler abstractHandler = new SensorFailureHandler(); // abstrakcyjnie
        abstractHandler.handleEvent("Pressure > max");

        SensorFailureHandler concreteHandler = new SensorFailureHandler(); // konkretnie
        concreteHandler.handleEvent("Temperature < min");
    }
}