package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternReport;


// Abstraction - Measurement Station with Report Generation
public abstract class ReportableMeasurementStation {
    protected ReportGenerator reportGenerator;

    public ReportableMeasurementStation(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public abstract String measureAndReport(String fileName);
}

