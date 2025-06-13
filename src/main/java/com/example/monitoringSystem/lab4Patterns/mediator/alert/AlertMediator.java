//Tydzień 5, Wzorzec Mediator - interfejs mediatora alertów
//Definiuje kontrakt komunikacji między komponentami systemu alertów
//Centralizuje logikę interakcji i zmniejsza sprzężenie między komponentami
package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public interface AlertMediator {
    void notify(Component sender, String event);
}
//Koniec, Tydzień 5, Wzorzec Mediator - interfejs
