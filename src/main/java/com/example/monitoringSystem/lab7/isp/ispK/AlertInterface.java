//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs alertów
//Przykład złego projektowania - wymusza implementację wszystkich typów powiadomień
//Klienci muszą implementować metody email, SMS i push nawet jeśli używają tylko jednej
package com.example.monitoringSystem.lab7.isp.ispK;

public interface AlertInterface {
    void sendEmailAlert(String msg);
    void sendSmsAlert(String msg);
    void sendPushNotification(String msg);
}

//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczny interfejs
