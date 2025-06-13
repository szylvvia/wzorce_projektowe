//Tydzień 7, Zasada OCP (Open/Closed Principle), silnik polityk alertów
//Centralizuje logikę sprawdzania progów dla różnych typów pomiarów
//Może być rozszerzony o nowe typy sprawdzeń zgodnie z zasadą OCP
package com.example.monitoringSystem.lab6.ocpData3;

import java.util.Map;

public class AlertPolicyEngine_ocpData3 {
    private static final Map<String, Double> limits = Map.of(
            "temperature", 23.0
    );

    public static boolean check(String type, Measurement_ocpData3 m) {
        if ("temperature".equals(type)) {
            return m.temperature > limits.get("temperature");
        }
        return false;
    }
}
//Koniec, Tydzień 7, Zasada OCP - silnik polityk alertów
