//Tydzień 8, Zasada LSP - system alertów zgodny z Liskov Substitution Principle
//Klasa bazowa definiuje kontrakt dla systemów powiadomień
//Podklasy mogą zastąpić bazową bez naruszania oczekiwanych zachowań
package com.example.monitoringSystem.lab7.liskov.liskovM;

public abstract class AlertSystem_liskov {
    public abstract void checkAndAlert(double value);
}

//Koniec, Tydzień 8, Zasada LSP - system alertów