//Tydzień 8, Zasada ISP - podstawowa implementacja stacji glebowej
//Implementuje tylko interfejs SoilStation zgodnie z ISP
//Nie jest obciążona metodami dla stacji powietrza czy wody
package com.example.monitoringSystem.lab7.isp.ispS.isp3;

public class BasicSoilStation implements SoilStation, SensorMaintenance {
    @Override
    public void monitorSoilHumidity() {
        double soilHumidityRange = 100;
        System.out.println("Monitoring soil humidity... | Soil humidity: "+ Math.round(Math.random()*soilHumidityRange)+" %");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the soil station...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the soil station...");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating the soil station...");
    }
}

//Koniec, Tydzień 8, Zasada ISP - implementacja stacji glebowej
