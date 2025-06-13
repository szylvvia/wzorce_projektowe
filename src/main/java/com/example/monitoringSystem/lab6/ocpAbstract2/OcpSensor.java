//Tydzień 7, Zasada OCP (Open/Closed Principle), klasa zarządzająca operacjami na czujnikach
//Wykorzystuje abstrakcję do obsługi różnych typów czujników bez znajomości ich implementacji
//Demonstruje jak OCP pozwala na polimorficzne przetwarzanie obiektów
package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.List;

public class OcpSensor {
    public void measureAllSensors(List<ASensor> sensorList) {
        for (ASensor sensor : sensorList) {
            sensor.measure();
        }
    }
    public void showAllMeasurements(List<ASensor> sensorList) {
        for (ASensor sensor : sensorList) {
            sensor.calibrate();
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP - zarządzanie czujnikami
