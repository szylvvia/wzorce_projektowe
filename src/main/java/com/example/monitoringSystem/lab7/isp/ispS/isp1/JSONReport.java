//Tydzień 8, Zasada ISP - interfejs dla raportów JSON
//Segregacja interfejsu - specjalistyczny interfejs tylko dla generowania JSON
//Zgodnie z ISP - nie wymusza implementacji CSV czy PDF
package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public interface JSONReport {
    void generateJSONReport(String data);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs JSON
