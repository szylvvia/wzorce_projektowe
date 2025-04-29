package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;

public class OcpReport {
    public void generateAllReports(List<IReport> reports) {
        for (IReport report : reports) {
            report.generateReport();
        }
    }
}
