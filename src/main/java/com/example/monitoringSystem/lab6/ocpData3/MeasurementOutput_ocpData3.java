//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs wyjścia pomiarów
//Abstrakcyjny kontrakt dla różnych kanałów wyjściowych danych pomiarowych
//Podstawa dla rozszerzalnego systemu wyjściowego zgodnego z zasadą OCP
package com.example.monitoringSystem.lab6.ocpData3;

public interface MeasurementOutput_ocpData3 {
    void output(String formattedData);
}
//Koniec, Tydzień 7, Zasada OCP - interfejs wyjścia
