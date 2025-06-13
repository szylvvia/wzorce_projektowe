package com.example.monitoringSystem.lab6.ocpAbstract2;

//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja podstawowych statystyk matematycznych
//Rozszerza system o funkcjonalność obliczania średniej i mediany bez modyfikacji kodu bazowego
//Przykład jak OCP pozwala na dodawanie nowych metod analizy statystycznej
public class MathStatistics extends AStatistics {
    private double mean;
    private double median;

    public MathStatistics(double mean, double median) {
        this.mean = mean;
        this.median = median;
    }

    @Override
    void calculateStatistics() {
        System.out.println("Calculating statistics mean: " + mean + " and median: " + median);
    }

    @Override
    void generateReport() {
        System.out.println("Generating report with mean: " + mean + " and median: " + median);
    }

    public double getMean() {
        return mean;
    }

    public double getMedian() {
        return median;
    }
}
//Koniec, Tydzień 7, Zasada OCP - statystyki matematyczne
