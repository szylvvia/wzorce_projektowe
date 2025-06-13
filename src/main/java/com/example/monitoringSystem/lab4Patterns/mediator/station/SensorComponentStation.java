//Tydzień 5, Wzorzec Mediator - komponent sensora stacji
//Wykrywa anomalie i powiadamia mediatora o zdarzeniach
//Część systemu stacji komunikującego się przez wzorzec Mediator
package com.example.monitoringSystem.lab4Patterns.mediator.station;

public class SensorComponentStation extends Component {
    public SensorComponentStation(StationMediator mediator) {
        super(mediator);
    }

    public void detect() {
        System.out.println("[Station] Sensor detected anomaly.");
        mediator.notify(this, "Detected");
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - sensor stacji
