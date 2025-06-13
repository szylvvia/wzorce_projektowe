//Tydzień 8, Zasada ISP - implementacja podstawowego sensora temperatury
//Implementuje tylko interfejs TemperatureSensor zgodnie z ISP
//Nie jest obciążona metodami dla wilgotności czy ciśnienia
package com.example.monitoringSystem.lab7.isp.ispK;

import com.example.monitoringSystem.lab7.isp.ispK.TemperatureSensor;

public class BasicTemperatureSensor implements TemperatureSensor {
    @Override
    public void readTemperature() {
        System.out.println("Reading temperature from BasicTemperatureSensor");
    }
}

//Koniec, Tydzień 8, Zasada ISP - sensor temperatury
