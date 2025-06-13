//Tydzień 8, Zasada ISP - interfejs dla alertów email
//Segregacja interfejsu - specjalistyczny interfejs tylko dla powiadomień email
//Zgodnie z ISP - klienci implementują tylko funkcjonalność email
package com.example.monitoringSystem.lab7.isp.ispK;

public interface EmailAlert {
    void sendEmailAlert(String msg);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs email
