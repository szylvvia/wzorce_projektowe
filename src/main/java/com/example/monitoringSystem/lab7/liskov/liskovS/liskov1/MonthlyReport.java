package com.example.monitoringSystem.lab7.liskov.liskovS.liskov1;

public class MonthlyReport extends Report {

    public MonthlyReport(String date, String author) {
        super(date, author);
    }

    @Override
    void generateReport() {
        System.out.println("[MONTHLY] Generating report...");
        System.out.println("Date: " + getDate());
        System.out.println("Author: " + getAuthor());
    }

    @Override
    void saveReport() {
        System.out.println("[MONTHLY] Saving report...");
    }
}
