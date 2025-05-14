package com.example.monitoringSystem.lab7.liskov.liskovS;

public class MonthlyReport extends Report {

    public MonthlyReport(String date, String author) {
        super(date, author);
    }

    @Override
    void generateReport() {
        System.out.println("[MONTHLY] Generowanie raportu...");
        System.out.println("Data: " + getDate());
        System.out.println("Autor: " + getAuthor());
    }

    @Override
    void saveReport() {
        System.out.println("[MONTHLY] Zapisanie raportu...");
    }
}
