//Tydzień 7, Zasada OCP (Open/Closed Principle), selektor formaterów z mapą
//Wykorzystuje mapę do dynamicznego wyboru odpowiedniego formatera danych
//System otwarty na rozszerzenia o nowe formatery, zamknięty na modyfikacje selektora
package com.example.monitoringSystem.lab6.ocpData3;

import java.util.Map;

public class FormatterSelector_ocpData3 {
    private static final Map<String, MeasurementFormatter_ocpData3> formatterMap = Map.of(
            "json", new JsonFormatter_ocpData3()
    );

    public static MeasurementFormatter_ocpData3 get(String type) {
        return formatterMap.getOrDefault(type, new JsonFormatter_ocpData3());
    }
}
//Koniec, Tydzień 7, Zasada OCP - selektor formaterów
