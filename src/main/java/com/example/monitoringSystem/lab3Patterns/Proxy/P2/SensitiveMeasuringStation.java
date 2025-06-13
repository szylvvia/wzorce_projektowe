package com.example.monitoringSystem.lab3Patterns.Proxy.P2;

// Tydzień 4, Proxy Pattern, Rzeczywista implementacja stacji z wrażliwymi danymi
public class SensitiveMeasuringStation implements MeasuringStationP2 {
    @Override
    public String accessDataP2(String userRole) {
        return "Protection Proxy: Access granted to sensitive data.";
    }
}
// Koniec, Tydzień 4, Proxy Pattern
