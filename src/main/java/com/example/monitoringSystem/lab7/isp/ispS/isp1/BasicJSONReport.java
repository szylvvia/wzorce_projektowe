package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public class BasicJSONReport implements JSONReport {
    @Override
    public void generateJSONReport(String data) {
        System.out.println("Generowanie raportu JSON z danymi: " + data);
    }
}
