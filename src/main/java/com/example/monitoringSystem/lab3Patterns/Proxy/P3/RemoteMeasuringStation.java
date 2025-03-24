package com.example.monitoringSystem.lab3Patterns.Proxy.P3;

// Real Subject
public class RemoteMeasuringStation implements MeasuringStationP3 {
    @Override
    public String fetchDataP3() {
        return "Remote Proxy: Retrieved data from remote measuring station.";
    }
}
