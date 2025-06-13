package com.example.monitoringSystem.lab6.ocpAbstract3;

//Tydzień 7, Zasada OCP (Open/Closed Principle), kolektor danych pomiarowych
//Generuje losowe pomiary środowiskowe zgodnie z zasadą OCP
//Może być rozszerzony o nowe typy pomiarów bez modyfikacji istniejącego kodu
public class MeasurementCollector_ocpAbstract3 {

    public Measurement_ocpAbstract3 collect() {
        double tempMultiplier = 30;
        double humidityMultiplier = 100;
        double pressureMultiplier = 20;
        int pressureOffset = 1000;

        double temp = Math.random() * tempMultiplier;
        double humidity = Math.random() * humidityMultiplier;
        double pressure = pressureOffset + Math.random() * pressureMultiplier;

        return new Measurement_ocpAbstract3(temp, humidity, pressure);
    }
}
//Koniec, Tydzień 7, Zasada OCP - kolektor pomiarów

