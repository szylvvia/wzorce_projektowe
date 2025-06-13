//Tydzień 7, Zasada OCP (Open/Closed Principle), zarządzanie operacjami na czujnikach
//Wykorzystuje abstrakcję do polimorficznej obsługi różnych typów sensorów
//Przykład jak OCP pozwala na dodawanie nowych czujników bez modyfikacji logiki zarządzającej
package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;

public class OcpSensor {
    public void readMeasurementFromAllSensors(List<ISensor> sensors) {
        for (ISensor sensor : sensors) {
            sensor.readMeasurement();
        }
    }
}
//Koniec, Tydzień 7, Zasada OCP - zarządzanie czujnikami
