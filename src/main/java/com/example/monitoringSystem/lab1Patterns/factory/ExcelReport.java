package com.example.monitoringSystem.lab1Patterns.factory;

public class ExcelReport implements Report {
    @Override
    public String getFormat() {
        return "Excel";
    }
}
