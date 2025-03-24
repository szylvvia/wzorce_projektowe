package com.example.monitoringSystem.lab3Patterns.Proxy.P2;

import com.example.monitoringSystem.lab3Patterns.Proxy.P1.RealMeasuringStation;

// Proxy
public class ProtectionMeasuringStationProxy implements MeasuringStationP2 {
    private final SensitiveMeasuringStation protectedStation = new SensitiveMeasuringStation();

    @Override
    public String accessDataP2(String userRole) {
        if ("admin".equalsIgnoreCase(userRole)) {
            return protectedStation.accessDataP2(userRole);
        } else {
            return "Protection Proxy: Access denied for user role: " + userRole;
        }
    }

    public String getDataP2(String userRole) {
        return accessDataP2(userRole);
    }
}