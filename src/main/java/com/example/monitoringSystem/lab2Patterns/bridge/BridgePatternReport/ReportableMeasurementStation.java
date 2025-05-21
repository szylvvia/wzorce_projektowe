package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;


import com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport.exceptions.ReportGenerationException;

// Abstraction - Measurement Station with Report Generation
public abstract class ReportableMeasurementStation {
    protected ReportGenerator reportGenerator;

    public ReportableMeasurementStation(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public abstract String measureAndReport(String fileName) throws ReportGenerationException;
}
