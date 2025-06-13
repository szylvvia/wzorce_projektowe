//Tydzień 7, Zasada OCP (Open/Closed Principle), implementacja wyjścia konsolowego
//Rozszerza system wyjściowy o wyświetlanie w konsoli bez modyfikacji kodu bazowego
//Przykład jak OCP pozwala na dodawanie nowych kanałów wyjściowych
package com.example.monitoringSystem.lab6.ocpData3;

public class ConsoleOutput_ocpData3 implements MeasurementOutput_ocpData3 {
    @Override
    public void output(String formattedData) {
        System.out.println("OUTPUT: " + formattedData);
    }
}
//Koniec, Tydzień 7, Zasada OCP - wyjście konsolowe
