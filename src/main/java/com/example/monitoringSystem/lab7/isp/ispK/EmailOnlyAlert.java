//Tydzień 8, Zasada ISP - implementacja alertów tylko email
//Implementuje wyłącznie funkcjonalność powiadomień email zgodnie z ISP
//Nie jest obciążona niepotrzebnymi metodami SMS czy push notifications
package com.example.monitoringSystem.lab7.isp.ispK;

public class EmailOnlyAlert implements EmailAlert {
    @Override
    public void sendEmailAlert(String msg) {
        System.out.println("Sending email alert: " + msg);
    }
}

//Koniec, Tydzień 8, Zasada ISP - implementacja email
