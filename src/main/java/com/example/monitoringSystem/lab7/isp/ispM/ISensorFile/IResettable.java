//Tydzień 8, Zasada ISP - interfejs dla resetowania sensora
//Segregacja interfejsu - specjalistyczny interfejs tylko dla operacji reset
//Zgodnie z ISP - klienci implementują tylko funkcjonalność resetowania
package com.example.monitoringSystem.lab7.isp.ispM.ISensorFile;

public interface IResettable {
    void reset();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs reset
