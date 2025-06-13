//Tydzień 8, Zasada ISP - implementacja raportu CSV
//Implementuje tylko interfejs CSVReport zgodnie z ISP
//Nie jest obciążona metodami dla JSON czy PDF
package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public class BasicCSVReport implements CSVReport{
    @Override
    public void generateCSVReport(String data) {
        System.out.println("Generowanie raportu CSV z danymi: " + data);
    }
}
//Koniec, Tydzień 8, Zasada ISP - implementacja CSV
