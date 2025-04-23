package com.example.monitoringSystem.lab2Patterns.adapter;

// odpowiedzialność: tylko konwersja prędkości wiatru
public class MphWindAdapter {
    private final double kmPerHour;

    public MphWindAdapter(double kmPerHour) {
        this.kmPerHour = kmPerHour;
    }

    public double toMph() {
        return kmPerHour / 1.609;
    }
}

//public class MphWindAdapter implements WindSpeedAdapter {
//    private final WindSpeedSensor sensor;
//
//    public MphWindAdapter(WindSpeedSensor sensor) {
//        this.sensor = sensor;
//    }
//
//    public double getSpeed() {
//        return sensor.getSpeed() * 0.621371;
//    }
//}