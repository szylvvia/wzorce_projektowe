package com.example.monitoringSystem.lab6.ocpData3;

public class TemperatureAlertChecker_ocpData3 implements AlertChecker_ocpData3 {
    @Override
    public boolean isAlert(Measurement_ocpData3 m) {
        return m.temperature > 23.0;
    }
}
