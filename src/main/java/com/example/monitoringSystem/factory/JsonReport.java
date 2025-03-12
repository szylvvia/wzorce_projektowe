package com.example.monitoringSystem.factory;

public class JsonReport implements Report {
    @Override
    public String getFormat() {
        return "JSON";
    }
}
