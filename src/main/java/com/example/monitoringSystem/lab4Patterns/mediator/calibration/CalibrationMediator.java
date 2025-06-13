//Tydzień 5, Wzorzec Mediator - interfejs mediatora kalibracji
//Definiuje kontrakt komunikacji między komponentami systemu kalibracji
//Centralizuje logikę interakcji i zmniejsza sprzężenie między komponentami
package com.example.monitoringSystem.lab4Patterns.mediator.calibration;

public interface CalibrationMediator {
    void notify(Component sender, String event);
}
//Koniec, Tydzień 5, Wzorzec Mediator - interfejs kalibracji
