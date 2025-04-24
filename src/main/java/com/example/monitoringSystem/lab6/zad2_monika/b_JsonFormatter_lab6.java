package com.example.monitoringSystem.lab6.zad2_monika;

public class b_JsonFormatter_lab6 implements b_MeasurementFormatter_lab6 {
    @Override
    public String format(a_Measurement_lab6m m) {
        return String.format("{\"temp\": %.2f, \"humidity\": %.2f}", m.temperature, m.humidity);
    }
}
