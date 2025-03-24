package com.example.monitoringSystem.lab3Patterns.Proxy.P3;

// Proxy
public class RemoteMeasuringStationProxy implements MeasuringStationP3 {
    private RemoteMeasuringStation realStation;

    @Override
    public String fetchDataP3() {
        if (realStation == null) {
            System.out.println("Connecting to remote station...");
            realStation = new RemoteMeasuringStation();
        }
        return realStation.fetchDataP3();
    }

    public String getDataP3() {
        return fetchDataP3();
    }
}
