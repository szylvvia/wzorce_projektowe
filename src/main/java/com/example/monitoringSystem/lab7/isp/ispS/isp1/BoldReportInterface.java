//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs raportów
//Przykład złego projektowania - wymusza implementację wszystkich formatów raportów
//Klienci muszą implementować CSV, JSON i PDF nawet jeśli używają tylko jednego formatu
package com.example.monitoringSystem.lab7.isp.ispS.isp1;

public interface BoldReportInterface {
    void generateCSVReport(String data);
    void generatePDFReport(String data);
    void generateJSONReport(String data);
}

//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczny raport
