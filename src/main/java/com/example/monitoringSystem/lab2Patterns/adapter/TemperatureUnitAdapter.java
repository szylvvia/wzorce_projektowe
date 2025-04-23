package com.example.monitoringSystem.lab2Patterns.adapter;


// odpowiedzialność: tylko konwersja temperatur
public class TemperatureUnitAdapter {
    private final double celsius;

    public TemperatureUnitAdapter(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }
}

//public class TemperatureUnitAdapter extends CelsiusSensor implements TemperatureAdapter {
//    private final TemperatureSensor sensor;
//
//    public TemperatureUnitAdapter(TemperatureSensor sensor) {
//        this.sensor = sensor;
//    }
//
//    @Override
//    public double getTemperatureInFahrenheit() {
//        return (sensor.getTemperature() * 9 / 5) + 32;
//    }
//
//    @Override
//    public double getTemperatureInKelvin() {
//        return sensor.getTemperature() + 273.15;
//    }
//}
