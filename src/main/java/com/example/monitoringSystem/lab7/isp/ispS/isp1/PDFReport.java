//Tydzień 8, Zasada ISP - interfejs dla raportów PDF
//Segregacja interfejsu - specjalistyczny interfejs tylko dla generowania PDF
//Zgodnie z ISP - klienci implementują tylko funkcjonalność PDF
package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public interface PDFReport {
    void generatePDFReport(String data);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs PDF
