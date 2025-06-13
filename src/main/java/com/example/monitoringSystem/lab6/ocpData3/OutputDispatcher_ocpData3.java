//Tydzień 7, Zasada OCP (Open/Closed Principle), dyspozytor wyjść z mapą
//Centralizuje zarządzanie różnymi kanałami wyjściowymi danych
//System otwarty na rozszerzenia o nowe wyjścia, zamknięty na modyfikacje dyspozytora
package com.example.monitoringSystem.lab6.ocpData3;

import java.util.Map;

public class OutputDispatcher_ocpData3 {
    private static final Map<String, MeasurementOutput_ocpData3> outputs = Map.of(
            "console", new ConsoleOutput_ocpData3()
    );

    public static void dispatch(String type, String data) {
        outputs.getOrDefault(type, new ConsoleOutput_ocpData3()).output(data);
    }
}
//Koniec, Tydzień 7, Zasada OCP - dyspozytor wyjść
