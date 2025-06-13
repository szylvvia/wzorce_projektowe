//Tydzień 5, Wzorzec Mediator - komponent stacji w systemie kalibracji
//Inicjuje proces kalibracji i komunikuje się z innymi komponentami przez mediatora
//Część systemu kalibracji wykorzystującego wzorzec Mediator
package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public class StationComponent extends Component {
    public StationComponent(CalibrationMediator mediator) {
        super(mediator);
    }

    public void startCalibration() {
        mediator.notify(this, "StartCalibration");
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - stacja kalibracji
