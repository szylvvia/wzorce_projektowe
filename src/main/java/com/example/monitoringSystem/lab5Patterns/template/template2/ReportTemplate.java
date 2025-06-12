package com.example.monitoringSystem.lab5Patterns.template.template2;

import java.util.Map;

//Tydzień 6, Wzorzec Template Method, abstrakcyjna klasa definiująca szablon algorytmu generowania raportów
abstract class ReportTemplate {

    public final void generateReport(Map<String, String> reportDetails, Map<String, Double> data) {
        String type = reportDetails.get("type");
        String location = reportDetails.get("location");
        String author = reportDetails.get("author");
        String date = reportDetails.get("date");

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
    }    public abstract void sendReport();

}
//Koniec, Tydzień 6, Wzorzec Template Method
