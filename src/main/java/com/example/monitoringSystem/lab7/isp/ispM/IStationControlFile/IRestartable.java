//Tydzień 8, Zasada ISP - interfejs dla operacji restartu
//Segregacja interfejsu - specjalistyczny interfejs tylko dla funkcji restart
//Zgodnie z ISP - nie wymusza implementacji start, stop czy pause
package com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile;

public interface IRestartable {
    void restart();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs restart
