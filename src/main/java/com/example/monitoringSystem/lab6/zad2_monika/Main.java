package com.example.monitoringSystem.lab6.zad2_monika;


public class Main {
    public static void main(String[] args) {
        a_MeasurementCollector_lab6m collector = new a_MeasurementCollector_lab6m();
        a_Measurement_lab6m m = collector.collect();

        System.out.println("🛰 Pomiar: " + m.temperature + "°C, " + m.humidity + "%");

        // FORMATTER
        b_MeasurementFormatter_lab6 formatter = b_FormatterSelector_lab6.get("json");
        String formatted = formatter.format(m);

        // ALERT
        boolean alert1 = new c_TemperatureAlertChecker_lab6().isAlert(m);
        boolean alert2 = c_AlertPolicyEngine_lab6.check("temperature", m);

        // OUTPUT
        d_OutputDispatcher_lab6.dispatch("console", formatted);

        if (alert1 || alert2) {
            System.out.println("🚨 ALERT: przekroczony próg temperatury!");
        }
    }
}
