package com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile;

//Tydzień 8, Zasada ISP - interfejs dla operacji wznowienia
//Segregacja interfejsu - specjalistyczny interfejs tylko dla funkcji resume
//Zgodnie z ISP - klienci implementują tylko funkcjonalność wznowienia
public interface IResumable {
    void resume();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs resume