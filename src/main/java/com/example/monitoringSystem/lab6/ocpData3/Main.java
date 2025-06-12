package com.example.monitoringSystem.lab6.ocpData3;

//Tydzień 7, Zasada OCP 1
//Open/Closed Principle - otwarte na rozszerzenia, zamknięte na modyfikacje
//System pomiarowy rozszerzalny o nowe formatery, alerty i wyjścia bez zmiany istniejącego kodu

public class Main {
    public static void main(String[] args) {
        MeasurementCollector_ocpData3 collector = new MeasurementCollector_ocpData3();
        Measurement_ocpData3 m = collector.collect();

        System.out.println("🛰 Pomiar: " + m.temperature + "°C, " + m.humidity + "%");

        // FORMATTER
        MeasurementFormatter_ocpData3 formatter = FormatterSelector_ocpData3.get("json");
        String formatted = formatter.format(m);

        // ALERT
        boolean alert1 = new TemperatureAlertChecker_ocpData3().isAlert(m);
        boolean alert2 = AlertPolicyEngine_ocpData3.check("temperature", m);

        // OUTPUT
        OutputDispatcher_ocpData3.dispatch("console", formatted);        if (alert1 || alert2) {
            System.out.println("🚨 ALERT: przekroczony próg temperatury!");
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP 1
