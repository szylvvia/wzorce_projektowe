//Tydzień 7, Zasada OCP (Open/Closed Principle), konkretna implementacja pomiaru temperatury
//Nowa funkcjonalność dodana przez implementację interfejsu bez naruszania istniejącego kodu
//Demonstruje rozszerzalność systemu pomiarowego zgodnie z zasadą OCP
package com.example.monitoringSystem.lab6.ocpAbstract;

public class TemperatureMeasurement implements MeasurementStrategy {
    @Override
    public String performMeasurement() {
        return "Temperature: 22.5 °C";
    }
}
//Koniec, Tydzień 7, Zasada OCP - pomiar temperatury

