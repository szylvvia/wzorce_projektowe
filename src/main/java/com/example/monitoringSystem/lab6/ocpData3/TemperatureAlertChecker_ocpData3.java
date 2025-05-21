package com.example.monitoringSystem.lab6.ocpData3;

public class TemperatureAlertChecker_ocpData3 implements AlertChecker_ocpData3 {
    @Override
    public boolean isAlert(Measurement_ocpData3 m) {
        int temperatureThreshold = 23;
        return m.temperature > temperatureThreshold;
    }
}
