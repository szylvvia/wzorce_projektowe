//Tydzień 8, Zasada ISP - interfejs dla push notifications
//Segregacja interfejsu - specjalistyczny interfejs tylko dla powiadomień push
//Zgodnie z ISP - nie wymusza implementacji email czy SMS
package com.example.monitoringSystem.lab7.isp.ispK;

public interface PushNotificationAlert {
    void sendPushNotification(String msg);
}

//Koniec, Tydzień 8, Zasada ISP - interfejs push notifications
