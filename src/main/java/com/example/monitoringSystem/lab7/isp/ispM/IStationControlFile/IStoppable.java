//Tydzień 8, Zasada ISP - interfejs dla operacji zatrzymania
//Segregacja interfejsu - specjalistyczny interfejs tylko dla funkcji stop
//Zgodnie z ISP - klienci implementują tylko funkcjonalność zatrzymania
package com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile;

public interface IStoppable {
    void stop();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs stop
