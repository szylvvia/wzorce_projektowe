package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight1;

import java.util.stream.Collectors;

//Tydzień 4, Flyweight Pattern, Kontekst używający flyweight - zawiera zewnętrzny stan czujnika cyfrowego
public class DigitalSensor {
    private final String ID;
    private final String MODEL;
    private EnvironmentalFlySensorDetails environmentalFlySensorDetails;
    private VisibleFlySensorDetails visibleFlySensorDetails;

    public DigitalSensor(String ID, String MODEL) {
        this.ID = ID;
        this.MODEL = MODEL;

    }

    public void setEnvironmentalFlySensorDetails(EnvironmentalFlySensorDetails environmentalFlySensorDetails) {
        this.environmentalFlySensorDetails = environmentalFlySensorDetails;
    }

    public void setVisibleFlySensorDetails(VisibleFlySensorDetails visibleFlySensorDetails) {
        this.visibleFlySensorDetails = new VisibleFlySensorDetails(visibleFlySensorDetails);
    }

    public String getCarData() {
        return "ID: " + ID + ", MODEL: " + MODEL;
    }

    @Override
    public String toString() {
        String mapAsString = environmentalFlySensorDetails.getSensorDetails().entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(", "));

        return getCarData() + " " + mapAsString;

    }

}
//Koniec, Tydzień 4, Flyweight Pattern
