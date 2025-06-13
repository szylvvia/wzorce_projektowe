//Tydzień 11, AOP - główna klasa demonstracyjna programowania aspektowego
//AOP z AspectJ - separacja zagadnień przekrojowych od logiki biznesowej
//Automatyczne logowanie i pomiar czasu wykonania metod przy użyciu aspektów
package com.example.monitoringSystem.lab9.AspectJ1;
public class Main {
    public static void main(String[] args) {
        MeasurementStation station = new MeasurementStation();
        System.out.println("Temperature: " + station.getTemperature());
        System.out.println("Humidity: " + station.getHumidity());    }
}

//Koniec, Tydzień 11, AOP - główna klasa demonstracyjna
