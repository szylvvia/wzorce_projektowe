//Tydzień 8, Zasada ISP - interfejs dla sensora wilgotności
//Segregacja interfejsu - specjalistyczny interfejs tylko dla pomiaru wilgotności
//Zgodnie z ISP - nie wymusza implementacji innych typów sensorów
package com.example.monitoringSystem.lab7.isp.ispK;

public interface HumiditySensor {
    void readHumidity();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs wilgotności
