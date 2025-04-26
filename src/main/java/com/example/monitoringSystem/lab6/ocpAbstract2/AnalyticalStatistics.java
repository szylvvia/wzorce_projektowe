package com.example.monitoringSystem.lab6.ocpAbstract2;

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
