package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public class BasicCSVReport implements CSVReport{
    @Override
    public void generateCSVReport(String data) {
        System.out.println("Generowanie raportu CSV z danymi: " + data);
    }
}
