//Tydzień 7, Zasada OCP (Open/Closed Principle), interfejs sprawdzacza alertów
//Definiuje kontrakt dla różnych typów sprawdzania alertów w systemie monitoringu
//Umożliwia dodawanie nowych rodzajów alertów bez modyfikacji istniejącego kodu
package com.example.monitoringSystem.lab6.ocpData3;

public interface AlertChecker_ocpData3 {
    boolean isAlert(Measurement_ocpData3 m);
}
//Koniec, Tydzień 7, Zasada OCP - interfejs sprawdzacza alertów
