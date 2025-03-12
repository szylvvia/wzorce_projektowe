package com.example.monitoringSystem.factory;

public class ExcelReport implements Report {
    @Override
    public String getFormat() {
        return "Excel";
    }
}
