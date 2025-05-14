package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public interface BoldReportInterface {
    void generateCSVReport(String data);
    void generatePDFReport(String data);
    void generateJSONReport(String data);
}
