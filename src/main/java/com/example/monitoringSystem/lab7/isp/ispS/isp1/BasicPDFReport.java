package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public class BasicPDFReport implements PDFReport{

    @Override
    public void generatePDFReport(String data) {
        System.out.println("Generowanie raportu PDF z danymi: " + data);
    }
}
