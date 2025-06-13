package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight3;

import java.util.HashMap;

//Tydzień 4, Flyweight Pattern, Fabryka zarządzająca współdzieleniem instancji flyweight dla alertów
public class DangerFlyAlertDetailsFactory {
    private static final HashMap<DangerFlyAlertDetailsFactory.AlertType, DangerFlyAlertDetails>
            alertDataSet = new HashMap<DangerFlyAlertDetailsFactory.AlertType,DangerFlyAlertDetails>();

    public static DangerFlyAlertDetails getAlertDetails(DangerFlyAlertDetailsFactory.AlertType alertType) {
        DangerFlyAlertDetails  alertDataImpl = alertDataSet.get(alertType);
        if (alertDataImpl == null) {
            if (alertType == DangerFlyAlertDetailsFactory.AlertType.LOW) {
                alertDataImpl = new DangerFlyAlertDetails("LOW", "Risk is low.");
            } else if (alertType == AlertType.MEDIUM) {
                alertDataImpl = new DangerFlyAlertDetails("MEDIUM", "Risk is medium.");
            } else if (alertType == AlertType.HIGH) {
                alertDataImpl = new DangerFlyAlertDetails("HIGH", "Risk is high.");
            }
            alertDataSet.put(alertType, alertDataImpl);
        }
        return alertDataImpl;
    }

    public static enum AlertType {
        LOW, MEDIUM, HIGH
    }
}
//Koniec, Tydzień 4, Flyweight Pattern
