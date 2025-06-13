//Tydzień 8, Zasada LSP - raport miesięczny
//Rozszerza klasę Report zachowując zgodność z interfejsem bazowym
//Może być używany wszędzie gdzie oczekiwana jest klasa Report
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

//Koniec, Tydzień 8, Zasada LSP - raport miesięczny