package com.example.monitoringSystem.lab5Patterns.template.template2;

import java.util.Map;

public class ReportPDF extends ReportTemplate {

    @Override
    public void prepareHeader(String title, String location) {
        System.out.println("-> Raport środowiskowy z dnia " + title + " w lokalizacji " + location);
    }

    @Override
    public void prepareBody(Map<String, Double> data) {
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            System.out.println("-> " + entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public void prepareFooter(String author, String date) {
        System.out.println("-> Wykonany przez: " + author + ", " + date+"\n");
    }

    @Override
    public void sendReport() {
        System.out.println("-> Raport PDF został wysłany....");
    }
}
