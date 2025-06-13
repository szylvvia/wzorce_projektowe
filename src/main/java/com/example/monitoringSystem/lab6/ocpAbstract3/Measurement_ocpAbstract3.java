//Tydzień 7, Zasada OCP (Open/Closed Principle), klasa reprezentująca pomiar środowiskowy
//Enkapsuluje dane pomiarowe - temperatura, wilgotność, ciśnienie
//Zgodnie z OCP może być rozszerzana o nowe pola bez modyfikacji istniejącego kodu
package com.example.monitoringSystem.lab6.ocpAbstract3;

public class Measurement_ocpAbstract3 {

    private double temperature;
    private double humidity;
    private double pressure;

    public Measurement_ocpAbstract3(double temperature, double humidity, double pressure) {
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
//Koniec, Tydzień 7, Zasada OCP - pomiar środowiskowy


