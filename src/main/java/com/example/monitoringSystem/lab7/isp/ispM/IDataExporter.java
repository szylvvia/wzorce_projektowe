package com.example.monitoringSystem.lab7.isp.ispM;

public interface IDataExporter {
    void exportToCSV();
    void exportToPDF();
    void uploadToCloud();
}
