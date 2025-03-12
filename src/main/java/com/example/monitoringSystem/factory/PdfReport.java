package com.example.monitoringSystem.factory;

public class PdfReport implements Report {
    @Override
    public String getFormat() {
        return "PDF";
    }
}
