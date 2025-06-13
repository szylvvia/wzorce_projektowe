//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjny nadawca powiadomień
//Łączy interfejs z bazową implementacją zgodnie z zasadą odwrócenia zależności
//Umożliwia tworzenie różnych kanałów powiadomień bez modyfikacji modułów wysokopoziomowych
package com.example.monitoringSystem.lab7.dip.dipK;

public abstract class AbstractNotificationSender implements NotificationSender {
    protected String recipient;

    public AbstractNotificationSender(String recipient) {
        this.recipient = recipient;
    }

    public abstract void send(String message);
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjny nadawca powiadomień

