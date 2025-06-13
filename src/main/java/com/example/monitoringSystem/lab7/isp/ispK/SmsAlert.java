//Tydzień 8, Zasada ISP - interfejs dla alertów SMS
//Segregacja interfejsu - specjalistyczny interfejs tylko dla powiadomień SMS
//Zgodnie z ISP - klienci implementują tylko funkcjonalność SMS
package com.example.monitoringSystem.lab7.isp.ispK;

public interface SmsAlert {
    void sendSmsAlert(String msg);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs SMS
