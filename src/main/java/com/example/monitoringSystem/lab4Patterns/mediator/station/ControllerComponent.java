//Tydzień 5, Wzorzec Mediator - komponent kontrolera stacji
//Aktywuje protokoły bezpieczeństwa na polecenie mediatora stacji
//Część systemu stacji komunikującego się przez wzorzec Mediator
package com.example.monitoringSystem.lab4Patterns.mediator.station;

public class ControllerComponent extends Component {
    public ControllerComponent(StationMediator mediator) {
        super(mediator);
    }

    public void activateProtocol() {
        System.out.println("[Station] Activating safety protocol.");
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - kontroler stacji
