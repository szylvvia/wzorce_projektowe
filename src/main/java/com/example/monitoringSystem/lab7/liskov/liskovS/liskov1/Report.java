package com.example.monitoringSystem.lab7.liskov.liskovS.liskov1;

public class Report {
    String date;
    String author;

    public Report(String date, String author) {
        this.date = date;
        this.author = author;
    }

    void generateReport() {
        System.out.println("Generating report...");
        System.out.println("Date: " + date);
        System.out.println("Author: " + author);
    }

    void saveReport() {
        System.out.println("Saving report..."+ date);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
