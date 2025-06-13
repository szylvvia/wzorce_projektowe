package com.example.monitoringSystem.lab3Patterns.Proxy.P2;

//Tydzień 4, Proxy Pattern, Protection Proxy - kontroluje dostęp do wrażliwych danych na podstawie uprawnień
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
//Koniec, Tydzień 4, Proxy Pattern