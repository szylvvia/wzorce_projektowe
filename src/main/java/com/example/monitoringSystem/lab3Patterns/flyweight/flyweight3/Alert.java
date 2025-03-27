package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight3;

import java.util.Date;
import java.util.stream.Collectors;

public class Alert {
    private final Date DATE;
    private final String LOCALIZATION;
    private DangerFlyAlertDetails alertDetails;

    public Alert(Date date, String localization) {
        this.DATE = date;
        this.LOCALIZATION = localization;
    }

    public String getAlert() {
        return "Alert: " + DATE + " " + LOCALIZATION;
    }

    public void setAlertDetails(DangerFlyAlertDetails alertDetails) {
        this.alertDetails = alertDetails;
    }

    @Override
    public String toString() {
        String mapAsString =  alertDetails.getAlertDetails().entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(", "));

        return getAlert() + " " + mapAsString;
    }
}
