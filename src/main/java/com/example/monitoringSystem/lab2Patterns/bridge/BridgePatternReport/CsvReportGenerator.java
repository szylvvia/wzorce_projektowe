package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

import java.io.FileWriter;
import java.io.IOException;

import java.io.File;
// Concrete Implementor - CSV Report
public class CsvReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(String data, String fileName) {
        // Ensure directory exists
        File reportsDir = new File("reports");
        if (!reportsDir.exists()) {
            reportsDir.mkdir();
        }

        try (FileWriter writer = new FileWriter("reports/" + fileName + ".csv")) {
            writer.append("Measurement Report\n");
            writer.append(data);
            writer.append("\n");
            System.out.println("CSV Report saved: reports/" + fileName + ".csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
