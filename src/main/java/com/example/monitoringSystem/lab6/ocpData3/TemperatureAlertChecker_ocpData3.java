//Tydzień 7, Zasada OCP (Open/Closed Principle), sprawdzacz alertów temperatury
//Konkretna implementacja sprawdzania progów temperaturowych
//Rozszerza system alertów bez modyfikacji istniejących sprawdzaczy
package com.example.monitoringSystem.lab6.ocpData3;

public class TemperatureAlertChecker_ocpData3 implements AlertChecker_ocpData3 {
    @Override
    public boolean isAlert(Measurement_ocpData3 m) {
        int temperatureThreshold = 23;
        return m.temperature > temperatureThreshold;
    }
}
//Koniec, Tydzień 7, Zasada OCP - sprawdzacz alertów temperatury
