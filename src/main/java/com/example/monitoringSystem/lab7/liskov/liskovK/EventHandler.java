//Tydzień 8, Zasada LSP - abstrakcyjna klasa obsługi zdarzeń
//Klasa bazowa definiująca kontrakt dla wszystkich handlerów
//Podklasy mogą rozszerzyć funkcjonalność bez naruszania kontraktu LSP
package com.example.monitoringSystem.lab7.liskov.liskovK;

public abstract class EventHandler {
    public abstract void handleEvent(String event);
}

//Koniec, Tydzień 8, Zasada LSP - abstrakcyjna klasa handlerów
