package com.example.monitoringSystem.lab6.zad1_monika;

public class Measurement_lab6 {

    private double temperature;
    private double humidity;
    private double pressure;

    public Measurement_lab6(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return String.format("Temp: %.2f°C, Humidity: %.2f%%, Pressure: %.2f hPa",
                temperature, humidity, pressure);
    }
}


