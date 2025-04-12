package com.example.monitoringSystem.lab5Patterns.template.template2;

import java.util.Map;

abstract class ReportTemplate {

    public final void generateReport(String type, String location, Map<String, Double> data, String author, String date, String fileName) {
        prepareHeader(type, location);
        prepareBody(data);
        prepareFooter(author, date);
        sendReport();
    }

    public void prepareHeader(String title, String location) {
        System.out.println("-> Generowanie nagłówka raportu: " + title + " w lokalizacji " + location);
    }

    public void prepareBody(Map<String, Double> data) {
        System.out.println("-> Generowanie treści raportu z danymi: " + data);
    }

    public void prepareFooter(String author, String date) {
        System.out.println("-> Generowanie stopki raportu: " + author + ", " + date);
    }

    public abstract void sendReport();

}
