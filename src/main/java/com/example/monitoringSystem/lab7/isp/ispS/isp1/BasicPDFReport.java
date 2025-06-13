//Tydzień 8, Zasada ISP - implementacja raportu PDF
//Implementuje tylko interfejs PDFReport zgodnie z ISP
//Nie jest obciążona metodami dla CSV czy JSON
package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public class BasicPDFReport implements PDFReport{

    @Override
    public void generatePDFReport(String data) {
        System.out.println("Generowanie raportu PDF z danymi: " + data);
    }
}
//Koniec, Tydzień 8, Zasada ISP - implementacja PDF
