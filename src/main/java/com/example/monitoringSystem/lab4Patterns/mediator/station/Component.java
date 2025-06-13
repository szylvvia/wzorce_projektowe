//Tydzień 5, Wzorzec Mediator - abstrakcyjna klasa komponentu stacji
//Bazowa klasa dla komponentów stacji komunikujących się przez mediatora
//Przechowuje referencję do mediatora stacji i zapewnia wspólny interfejs
package com.example.monitoringSystem.lab4Patterns.mediator.station;

public abstract class Component {
    protected StationMediator mediator;

    public Component(StationMediator mediator) {
        this.mediator = mediator;
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - komponent stacji
