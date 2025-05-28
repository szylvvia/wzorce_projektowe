package com.example.monitoringSystem.lab9.AspectJ3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportGeneratorService {

    final int MAX_MEASUREMENTS = 3;
    List<Double> dataMeasurements = new ArrayList<>();

    public String generateReport(String date) {
        for (int i = 0; i < MAX_MEASUREMENTS; i++) {
            dataMeasurements.add(Math.round(Math.random() * 100)/100.0);
        }
        System.out.println("Generating report with data: " + date + " - Measurements: " + dataMeasurements);
        return "Report generated for date: " + date + " with measurements: " + dataMeasurements;
    }

    public void sendReport() {
        System.out.println("Sending report to the monitoring system.");
    }

    public void archiveReport() {
        System.out.println("Archiving report with data: " + dataMeasurements);
        dataMeasurements.clear();
        System.out.println("Report archived and data cleared.");
    }
}
