//Tydzień 8, Zasada ISP - interfejs dla operacji pauzy
//Segregacja interfejsu - specjalistyczny interfejs tylko dla funkcji pause
//Zgodnie z ISP - klienci implementują tylko funkcjonalność pauzowania
package com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile;

public interface IPausable {
    void pause();
}
//Koniec, Tydzień 8, Zasada ISP - interfejs pause
