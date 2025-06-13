//Tydzień 11, AOP - stacja pomiarowa z aspektami
//Klasa biznesowa skupiona na logice pomiarów bez zagadnień przekrojowych
//Aspekty automatycznie dodają logowanie i pomiar czasu wykonania
package com.example.monitoringSystem.lab9.AspectJ1;

//Tydzień 11, AOP (Aspect-Oriented Programming), klasa stacji pomiarowej na której działają aspekty
public class MeasurementStation {

    public double getTemperature() {
        // Simulate data retrieval
        return 64.5;
    }

    public double getHumidity() {
        return 58.3;
    }

    public double getPressure() {
        return 1012.8;
    }
}
//Koniec, Tydzień 11, AOP - stacja pomiarowa
