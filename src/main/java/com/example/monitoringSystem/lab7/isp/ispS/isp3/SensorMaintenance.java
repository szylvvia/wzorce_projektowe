//Tydzień 8, Zasada ISP - interfejs konserwacji sensorów
//Segregacja interfejsu - specjalistyczny interfejs tylko dla operacji konserwacyjnych
//Zgodnie z ISP - oddzielne od funkcji monitoringu, implementowane tylko gdy potrzebne
package com.example.monitoringSystem.lab7.isp.ispS.isp3;

//Tydzień 8, Zasada ISP (Interface Segregation Principle), segregowany interfejs tylko dla operacji konserwacyjnych
public interface SensorMaintenance {
    void turnOn();
    void turnOff();
    void calibrate();
}
//Koniec, Tydzień 8, Zasada ISP - interfejs konserwacji
