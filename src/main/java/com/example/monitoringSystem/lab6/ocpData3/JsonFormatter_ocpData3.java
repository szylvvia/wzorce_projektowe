//Tydzień 7, Zasada OCP (Open/Closed Principle), formater JSON dla pomiarów
//Implementuje formatowanie danych w formacie JSON zgodnie z zasadą OCP
//Nowa funkcjonalność dodana bez modyfikacji istniejącego kodu systemu
package com.example.monitoringSystem.lab6.ocpData3;

public class JsonFormatter_ocpData3 implements MeasurementFormatter_ocpData3 {
    @Override
    public String format(Measurement_ocpData3 m) {
        return String.format("{\"temp\": %.2f, \"humidity\": %.2f}", m.temperature, m.humidity);
    }
}
//Koniec, Tydzień 7, Zasada OCP - formater JSON
