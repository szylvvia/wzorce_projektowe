package com.example.monitoringSystem.lab7.liskov.liskovS;

public class Report {
    String date;
    String author;

    public Report(String date, String author) {
        this.date = date;
        this.author = author;
    }

    void generateReport() {
        System.out.println("Generowanie raportu...");
        System.out.println("Data: " + date);
        System.out.println("Autor: " + author);
    }

    void saveReport() {
        System.out.println("Zapisanie raportu...");
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
