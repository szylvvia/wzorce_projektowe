//Tydzień 8, Zasada ISP - interfejs dla wyświetlania statusu sensora
//Segregacja interfejsu - specjalistyczny interfejs tylko dla funkcji statusu
//Zgodnie z ISP - nie wymusza implementacji kalibracji czy odczytu danych
package com.example.monitoringSystem.lab7.isp.ispM.ISensorFile;

public interface IStatusDisplayable {
    void displayStatus();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs statusu
