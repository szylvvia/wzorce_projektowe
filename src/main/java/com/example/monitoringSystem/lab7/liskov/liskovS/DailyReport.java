package com.example.monitoringSystem.lab7.liskov.liskovS;

public class DailyReport extends Report {

    public DailyReport(String date, String author) {
        super(date, author);
    }

    @Override
    void generateReport() {
        System.out.println("[DAILY] Generating report...");
        System.out.println("Date: " + getDate());
        System.out.println("Author: " + getAuthor());
    }

    @Override
    void saveReport() {
        System.out.println("[DAILY] Saving report...");
    }
}
