package com.example.monitoringSystem.lab2Patterns.adapter;

// odpowiedzialność: tylko konwersja ciśnienia
public class MmHgPressureAdapter {
    private final double hpa;

    public MmHgPressureAdapter(double hpa) {
        this.hpa = hpa;
    }

    public double toMmHg() {
        return hpa * 0.75006;
    }
}

//public class MmHgPressureAdapter implements PressureAdapter {
//    private final PressureSensor sensor;
//
//    public MmHgPressureAdapter(PressureSensor sensor) {
//        this.sensor = sensor;
//    }
//
//    public double getPressure() {
//        return sensor.getPressure() * 0.750062;
//    }
//}

