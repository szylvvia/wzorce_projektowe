package com.example.monitoringSystem.lab7.dip.dipS.dip2;

public abstract class ReportGenerator {
    protected IReport report;

    public ReportGenerator(IReport report) {
        this.report = report;
    }

    public abstract void generateReport(String title, String date);
}
