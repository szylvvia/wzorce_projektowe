//Tydzień 5, Wzorzec Mediator - abstrakcyjna klasa komponentu kalibracji
//Bazowa klasa dla komponentów systemu kalibracji komunikujących się przez mediatora
//Przechowuje referencję do mediatora kalibracji i zapewnia wspólny interfejs
package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public abstract class Component {
    protected CalibrationMediator mediator;

    public Component(CalibrationMediator mediator) {
        this.mediator = mediator;
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - komponent kalibracji
