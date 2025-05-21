package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//import java.io.File;
//// Concrete Implementor - CSV Report
//public class CsvReportGenerator implements ReportGenerator {
//    @Override
//    public void generateReport(String data, String fileName) {
//        // Ensure directory exists
//        File reportsDir = new File("reports");
//        if (!reportsDir.exists()) {
//            reportsDir.mkdir();
//        }
//
//        try (FileWriter writer = new FileWriter("reports/" + fileName + ".csv")) {
//            writer.append("Measurement Report\n");
//            writer.append(data);
//            writer.append("\n");
//            System.out.println("CSV Report saved: reports/" + fileName + ".csv");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.exceptions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class CsvReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(String data, String fileName) throws ReportGenerationException {
        File reportsDir = new File("reports");
//        if (!reportsDir.exists()) {
//            if (!reportsDir.mkdir()) {
//                throw new DirectoryCreationException("Failed to create directory: reports", null);
//            }
//        }
        if (reportsDir.exists() && !reportsDir.isDirectory()) {
            throw new DirectoryCreationException("A file named 'reports' already exists and is not a directory", null);
        }

        if (!reportsDir.exists()) {
            if (!reportsDir.mkdir()) {
                throw new DirectoryCreationException("Failed to create directory: reports", null);
            }
        }


        try (FileWriter writer = new FileWriter("reports/" + fileName + ".csv")) {
            writer.append("Measurement Report\n");
            writer.append(data);
            writer.append("\n");
            System.out.println("CSV Report saved: reports/" + fileName + ".csv");
        } catch (IOException e) {
            throw new ReportFileWriteException("Failed to write CSV report", e);
        }
    }
}
