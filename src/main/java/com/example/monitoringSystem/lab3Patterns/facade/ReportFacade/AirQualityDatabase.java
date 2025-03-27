package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class AirQualityDatabase implements DatabaseService {
    @Override
    public String getData() {
        return "Air Quality Index: 42 (Good)";
    }
}
