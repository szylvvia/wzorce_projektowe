//Tydzień 8, Zasada DIP (Dependency Inversion Principle), serwis alertów zależny od abstrakcji
//Wysokopoziomowy moduł zależący od interfejsu NotificationSender, nie od konkretnych implementacji
//Demonstruje jak DIP pozwala na wstrzykiwanie różnych implementacji bez zmiany kodu serwisu
package com.example.monitoringSystem.lab7.dip.dipK;

public class AlertService {
    private final NotificationSender sender;

    public AlertService(NotificationSender sender) {
        this.sender = sender;
    }

    public void triggerAlert(String alert) {
        sender.send(alert);
    }
}
//Koniec, Tydzień 8, Zasada DIP - serwis alertów

