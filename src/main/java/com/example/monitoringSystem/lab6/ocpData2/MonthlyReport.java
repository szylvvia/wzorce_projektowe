package com.example.monitoringSystem.lab6.ocpData2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja raportu miesięcznego
//Dodaje nową funkcjonalność raportowania miesięcznego bez modyfikacji kodu bazowego
//Przykład jak OCP umożliwia rozszerzanie systemu o nowe rodzaje analiz czasowych
import java.util.List;

public class MonthlyReport implements IReport {
    private String month;
    private List<String> aitQuality = List.of("Good", "Moderate", "Unhealthy for sensitive groups", "Unhealthy", "Very Unhealthy", "Hazardous");

    public MonthlyReport(String month) {
        this.month = month;
    }

    @Override
    public void generateReport() {

        System.out.println("[REPORT] Monthly report for " + month + " generated successfully - predicted air quality: "+
                aitQuality.get((int) (Math.random() * aitQuality.size())));
    }
}
//Koniec, Tydzień 7, Zasada OCP - raport miesięczny
