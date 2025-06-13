//Tydzień 7, Zasada OCP (Open/Closed Principle), sprawdzarka progów czujników
//Wykorzystuje polimorfizm do sprawdzania różnych typów progów bez znajomości ich implementacji
//System otwarty na rozszerzenia o nowe typy czujników, zamknięty na modyfikacje
package com.example.monitoringSystem.lab6.ocpData;

import java.util.List;

public class ThresholdChecker {
    public void checkThresholds(List<SensorThreshold> thresholds) {
        for (SensorThreshold threshold : thresholds) {
            if (threshold.getCurrentValue() > threshold.getLimit()) {
                System.out.println("ALERT: " + threshold.getSensorType() + " exceeds limit!");
            } else {
                System.out.println(threshold.getSensorType() + " is normal.");
            }
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP - sprawdzarka progów
