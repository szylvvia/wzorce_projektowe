package com.example.monitoringSystem.lab3Patterns.Proxy.P2;

// Real Subject
public class SensitiveMeasuringStation implements MeasuringStationP2 {
    @Override
    public String accessDataP2(String userRole) {
        return "Protection Proxy: Access granted to sensitive data.";
    }
}
