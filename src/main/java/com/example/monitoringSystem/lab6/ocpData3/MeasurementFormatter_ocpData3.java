//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs formatera pomiarów
//Definiuje kontrakt dla różnych sposobów formatowania danych pomiarowych
//Umożliwia dodawanie nowych formaterów bez modyfikacji istniejącego kodu
package com.example.monitoringSystem.lab6.ocpData3;

public interface MeasurementFormatter_ocpData3 {
    String format(Measurement_ocpData3 m);
}
//Koniec, Tydzień 7, Zasada OCP - interfejs formatera

