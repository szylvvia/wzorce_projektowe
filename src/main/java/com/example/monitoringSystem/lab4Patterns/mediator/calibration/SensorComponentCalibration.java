//Tydzień 5, Wzorzec Mediator - komponent sensora w systemie kalibracji
//Wykonuje operacje kalibracji na polecenie mediatora
//Część systemu kalibracji komunikującego się przez wzorzec Mediator
package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public class SensorComponentCalibration extends Component {
    public SensorComponentCalibration(CalibrationMediator mediator) {
        super(mediator);
    }

    public void calibrate() {
        System.out.println("[Calibration] Sensor is calibrating...");
    }
}
//Koniec, Tydzień 5, Wzorzec Mediator - sensor kalibracji
