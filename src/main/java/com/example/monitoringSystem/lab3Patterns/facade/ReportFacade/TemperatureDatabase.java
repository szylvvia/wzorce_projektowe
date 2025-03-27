package com.example.monitoringSystem.lab3Patterns.facade.ReportFacade;

public class TemperatureDatabase implements DatabaseService {
    @Override
    public String getData() {
        return "Average Temperature: 18.5°C";
    }
}
