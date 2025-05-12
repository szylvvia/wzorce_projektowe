package com.example.monitoringSystem.lab7.isp.ispM;

import com.example.monitoringSystem.lab7.isp.ispM.IDataExporterFile.ICSVExportable;

public class CSVLogger implements ICSVExportable {
    @Override
    public void exportToCSV() {
        System.out.println("Eksport do CSV...");
    }
}