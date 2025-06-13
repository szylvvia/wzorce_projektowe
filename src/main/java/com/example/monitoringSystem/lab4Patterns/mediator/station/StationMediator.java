//Tydzień 5, Wzorzec Mediator - interfejs mediatora stacji
//Definiuje kontrakt komunikacji między komponentami systemu stacji
//Centralizuje logikę interakcji i zmniejsza sprzężenie między komponentami stacji
package com.example.monitoringSystem.lab4Patterns.mediator.station;

public interface StationMediator {
    void notify(Component sender, String event);
}
//Koniec, Tydzień 5, Wzorzec Mediator - interfejs stacji
