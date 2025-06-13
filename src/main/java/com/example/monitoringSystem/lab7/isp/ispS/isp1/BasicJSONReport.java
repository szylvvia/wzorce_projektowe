//Tydzień 8, Zasada ISP - implementacja raportu JSON
//Implementuje tylko interfejs JSONReport zgodnie z ISP
//Nie jest obciążona metodami dla CSV czy PDF
package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public class BasicJSONReport implements JSONReport {
    @Override
    public void generateJSONReport(String data) {
        System.out.println("Generowanie raportu JSON z danymi: " + data);
    }
}
//Koniec, Tydzień 8, Zasada ISP - implementacja JSON
