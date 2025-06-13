//Tydzień 5, Wzorzec Mediator - komponent zarządzający alertami
//Konkretny komponent odpowiedzialny za wysyłanie alertów w systemie
//Komunikuje się z innymi komponentami przez mediatora alertów
package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public class AlertComponent extends Component {
    public AlertComponent(AlertMediator mediator) {
        super(mediator);
    }

    public void sendAlert(String msg) {
        System.out.println("!!! ALERT: " + msg);
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - komponent alertów
