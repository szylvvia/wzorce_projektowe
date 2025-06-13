//Tydzień 5, Wzorzec Mediator - komponent sensora w systemie alertów
//Monitoruje wartości temperatury i powiadamia mediatora o przekroczeniu progów
//Część systemu alertów komunikującego się przez wzorzec Mediator
package com.example.monitoringSystem.lab4Patterns.mediator.alert;

public class SensorComponentAlert extends Component {
    public SensorComponentAlert(AlertMediator mediator) {
        super(mediator);
    }

    public void readTemperature(double value) {
        int temperatureThreshold = 100;
        if (value > temperatureThreshold) {
            System.out.println("[Alert] Temperature = " + value);
            mediator.notify(this, "HighTemperature");
        }
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - sensor alertów
