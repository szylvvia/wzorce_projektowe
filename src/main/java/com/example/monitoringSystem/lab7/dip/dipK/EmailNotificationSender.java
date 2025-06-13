//Tydzień 8, Zasada DIP (Dependency Inversion Principle), implementacja powiadomień email
//Konkretna implementacja abstrakcji NotificationSender zgodnie z zasadą DIP
//Niskpoziomowy moduł, który może być zastąpiony bez wpływu na moduły wysokopoziomowe
package com.example.monitoringSystem.lab7.dip.dipK;

public class EmailNotificationSender extends AbstractNotificationSender {
    public EmailNotificationSender(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL to " + recipient + ": " + message);
    }
}
//Koniec, Tydzień 8, Zasada DIP - powiadomienia email

