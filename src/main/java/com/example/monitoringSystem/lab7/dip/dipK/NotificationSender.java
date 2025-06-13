//Tydzień 8, Zasada DIP (Dependency Inversion Principle), interfejs nadawcy powiadomień
//Abstrakcja na której opierają się moduły wysokopoziomowe zgodnie z zasadą DIP
//Pozwala na wymienne implementacje kanałów powiadomień bez modyfikacji kodu klienta
package com.example.monitoringSystem.lab7.dip.dipK;

public interface NotificationSender {
    void send(String message);
}
//Koniec, Tydzień 8, Zasada DIP - interfejs nadawcy

