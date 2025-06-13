//Tydzień 8, Zasada LSP - stacja monitoringu powietrza zgodna z LSP
//Rozszerza klasę MonitoringStation zachowując jej kontrakt
//Może zastąpić klasę bazową bez naruszania oczekiwanych zachowań
package com.example.monitoringSystem.lab7.liskov.liskovK;

public class AirMonitoringStation extends MonitoringStation {
    public AirMonitoringStation(String location) {
        super(location);
    }

    @Override
    public void collectData() {
        System.out.println("Air quality data collected at " + location);
    }
}

//Koniec, Tydzień 8, Zasada LSP - stacja monitoringu powietrza
