package com.example.monitoringSystem.lab5Patterns.template.template1;

abstract class EnvironmentalMonitoringStationTemplate {

    // Template method
    public final void runCycle(String type, String location, Integer resolution, Integer interval){
        System.out.println("--- Uruchomiono cykl monitorowania środowiska ---");
        turnOnSensors(type, location);
        calibrateSensors(resolution);
        collectData(interval);
        sendData();
        turnOffSensors(type, location);
        System.out.println("--- Zakończono cykl monitorowania środowiska ---\n");
    }

    // Defaultowe implementacja metody
    private void sendData(){
        System.out.println("-> Wysyłanie danych do serwera");
    }

    public void turnOnSensors(String type, String location){}
    public void calibrateSensors(Integer resolution){}
    public void collectData(Integer interval){}
    public void turnOffSensors(String type, String location){}
}
