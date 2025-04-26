package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.List;

public class OcpStatistics {
    public void calculateAllStatistics(List<AStatistics> statisticsList) {
        for (AStatistics statistics : statisticsList) {
            statistics.calculateStatistics();
        }
    }
    public void generateAllReports(List<AStatistics> statisticsList) {
        for (AStatistics statistics : statisticsList) {
            statistics.generateReport();
        }
    }
}
