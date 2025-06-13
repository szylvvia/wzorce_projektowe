//Tydzień 5, Wzorzec Mediator - abstrakcyjna klasa komponentu alertów
//Bazowa klasa dla komponentów uczestniczących w komunikacji przez mediatora
//Przechowuje referencję do mediatora i zapewnia wspólny interfejs
package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public abstract class Component {
    protected AlertMediator mediator;

    public Component(AlertMediator mediator) {
        this.mediator = mediator;
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - komponent bazowy
