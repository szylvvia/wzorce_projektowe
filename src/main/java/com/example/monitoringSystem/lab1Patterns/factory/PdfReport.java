package com.example.monitoringSystem.lab1Patterns.factory;

public class PdfReport implements Report {
    @Override
    public String getFormat() {
        return "PDF";
    }
}
