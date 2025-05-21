package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
//import java.io.FileOutputStream;
//import java.io.File;
//
//
//public class PdfReportGenerator implements ReportGenerator {
//    @Override
//    public void generateReport(String data, String fileName) {
//        // Ensure directory exists
//        File reportsDir = new File("reports");
//        if (!reportsDir.exists()) {
//            reportsDir.mkdir();
//        }
//
//        // Get absolute path
//        File reportFile = new File(reportsDir, fileName + ".pdf");
//
//        Document document = new Document();
//        try {
//            PdfWriter.getInstance(document, new FileOutputStream(reportFile));
//            document.open();
//            document.add(new Paragraph("Measurement Report"));
//            document.add(new Paragraph(data));
//            document.close();
//            //do sprawdzenia gdzie się zapisuje
//            System.out.println("✅ PDF Report saved at: " + reportFile.getAbsolutePath());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}


import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.exceptions.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;

public class PdfReportGenerator implements ReportGenerator {
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


        File reportFile = new File(reportsDir, fileName + ".pdf");
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(reportFile));
            document.open();
            document.add(new Paragraph("Measurement Report"));
            document.add(new Paragraph(data));
            document.close();
            System.out.println("✅ PDF Report saved at: " + reportFile.getAbsolutePath());
        } catch (Exception e) {
            throw new ReportFileWriteException("Failed to write PDF report", e);
        }
    }
}
