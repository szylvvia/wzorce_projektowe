package com.example.monitoringSystem.lab6.ocpData3;

//Tydzień 7, Zasada OCP (Open/Closed Principle), klasa reprezentująca pomiar środowiskowy
//Prosta struktura danych przechowująca temperaturę i wilgotność
//Zgodnie z OCP może być rozszerzana o nowe pola bez naruszania istniejącego kodu
public class Measurement_ocpData3 {

    public final double temperature;
    public final double humidity;

    public Measurement_ocpData3(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
//Koniec, Tydzień 7, Zasada OCP - pomiar środowiskowy
