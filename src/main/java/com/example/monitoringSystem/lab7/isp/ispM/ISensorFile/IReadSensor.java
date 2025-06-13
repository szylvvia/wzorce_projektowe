//Tydzień 8, Zasada ISP - interfejs dla odczytu danych z sensora
//Segregacja interfejsu - specjalistyczny interfejs tylko dla operacji odczytu
//Zgodnie z ISP - klienci implementują tylko funkcjonalność czytania danych
package com.example.monitoringSystem.lab7.isp.ispM.ISensorFile;

public interface IReadSensor {
    double readValue();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs odczytu
