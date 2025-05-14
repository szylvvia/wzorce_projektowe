package com.example.monitoringSystem.lab7.liskov.liskovS;

public class DailyReport extends Report {

    public DailyReport(String date, String author) {
        super(date, author);
    }

    @Override
    void generateReport() {
        System.out.println("[DAILY] Generowanie raportu...");
        System.out.println("Data: " + getDate());
        System.out.println("Autor: " + getAuthor());
    }

    @Override
    void saveReport() {
        System.out.println("[DAILY] Zapisanie raportu...");
    }
}
