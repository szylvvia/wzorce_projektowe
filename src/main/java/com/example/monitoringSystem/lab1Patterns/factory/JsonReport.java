package com.example.monitoringSystem.lab1Patterns.factory;

public class JsonReport implements Report {
    @Override
    public String getFormat() {
        return "JSON";
    }
}
