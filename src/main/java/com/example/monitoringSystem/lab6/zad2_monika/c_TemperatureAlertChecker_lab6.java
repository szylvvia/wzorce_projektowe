package com.example.monitoringSystem.lab6.zad2_monika;

public class c_TemperatureAlertChecker_lab6 implements c_AlertChecker_lab6 {
    @Override
    public boolean isAlert(a_Measurement_lab6m m) {
        return m.temperature > 23.0;
    }
}
