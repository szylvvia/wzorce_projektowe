//Tydzień 8, Zasada ISP - interfejs dla kalibracji sensora
//Segregacja interfejsu - specjalistyczny interfejs tylko dla operacji kalibracyjnych
//Zgodnie z ISP - nie wymusza implementacji odczytu czy resetowania
package com.example.monitoringSystem.lab7.isp.ispM.ISensorFile;

public interface ICalibratable {
    void calibrate();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs kalibracji