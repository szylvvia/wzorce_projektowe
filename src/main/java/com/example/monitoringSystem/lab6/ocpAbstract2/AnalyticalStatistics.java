package com.example.monitoringSystem.lab6.ocpAbstract2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja statystyk analitycznych
//Rozszerza system statystyczny o zaawansowane analizy bez modyfikacji kodu bazowego
//Przykład jak OCP umożliwia dodawanie nowych typów analiz statystycznych
public class AnalyticalStatistics extends AStatistics {
    private String type;
    double TStudent;
    double ZScore;

    public AnalyticalStatistics(String type, double TStudent, double ZScore) {
        this.type = type;
        this.TStudent = TStudent;
        this.ZScore = ZScore;
    }

    @Override
    void calculateStatistics() {
        System.out.println("Calculating analytical statistics of type: " + type + " with TStudent: " + TStudent + " and ZScore: " + ZScore);
    }

    @Override
    void generateReport() {
        System.out.println("Generating report of analytical statistics of type: " + type + " with TStudent: " + TStudent + " and ZScore: " + ZScore);
    }
}
//Koniec, Tydzień 7, Zasada OCP - statystyki analityczne
