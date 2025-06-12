//Tydzień 3, Bridge Pattern - interfejs implementora do generowania raportów, oddziela abstrakcję od implementacji generatora
package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;

//// Implementor - Report Generator Interface without exceptions
//public interface ReportGenerator {
//    void generateReport(String data, String fileName);
//}


import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.exceptions.ReportGenerationException;

public interface ReportGenerator {
    void generateReport(String data, String fileName) throws ReportGenerationException;
}
//Koniec, Tydzień 3, Bridge Pattern
