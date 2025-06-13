//Tydzień 8, Zasada ISP - interfejs dla raportów CSV
//Segregacja interfejsu - specjalistyczny interfejs tylko dla generowania CSV
//Zgodnie z ISP - klienci implementują tylko funkcjonalność CSV
package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public interface CSVReport {
    void generateCSVReport(String data);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs CSV
