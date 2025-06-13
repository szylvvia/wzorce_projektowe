//Tydzień 7, Zasada OCP (Open/Closed Principle), konkretna implementacja pomiaru ciśnienia
//Rozszerza system pomiarowy bez modyfikacji istniejących klas poprzez implementację interfejsu
//Przykład jak dodawać nowe typy pomiarów zgodnie z zasadą OCP
package com.example.monitoringSystem.lab6.ocpAbstract;

public class PressureMeasurement implements MeasurementStrategy {
    @Override
    public String performMeasurement() {
        return "Pressure: 1013 hPa";
    }
}
//Koniec, Tydzień 7, Zasada OCP - pomiar ciśnienia

