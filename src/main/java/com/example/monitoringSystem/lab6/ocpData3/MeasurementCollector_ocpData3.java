package com.example.monitoringSystem.lab6.ocpData3;

//Tydzień 7, Zasada OCP (Open/Closed Principle), kolektor pomiarów środowiskowych
//Generuje losowe dane pomiarowe temperatury i wilgotności
//Może być rozszerzony o nowe typy pomiarów zgodnie z zasadą OCP
public class MeasurementCollector_ocpData3 {
    public Measurement_ocpData3 collect() {
        int temperatureOffset = 15;
        int humidityOffset = 50;
        int temperatureRange = 10;
        int humidityRange = 30;

        double temp = temperatureOffset + Math.random() * temperatureRange;
        double humidity = humidityOffset + Math.random() * humidityRange;

        return new Measurement_ocpData3(temp, humidity);
    }
}
//Koniec, Tydzień 7, Zasada OCP - kolektor pomiarów
