package com.example.monitoringSystem.lab6.ocpData3;

public class JsonFormatter_ocpData3 implements MeasurementFormatter_ocpData3 {
    @Override
    public String format(Measurement_ocpData3 m) {
        return String.format("{\"temp\": %.2f, \"humidity\": %.2f}", m.temperature, m.humidity);
    }
}
