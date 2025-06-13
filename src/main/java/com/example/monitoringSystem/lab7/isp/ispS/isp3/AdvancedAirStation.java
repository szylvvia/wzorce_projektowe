//Tydzień 8, Zasada ISP - implementacja zaawansowanej stacji powietrza z segregacją interfejsów
//Implementuje tylko potrzebne interfejsy: AirStation dla monitoringu i SensorMaintenance dla konserwacji
//Zgodnie z ISP - klasa nie jest obciążona niepotrzebnymi metodami z innych typów stacji
package com.example.monitoringSystem.lab7.isp.ispS.isp3;

public class AdvancedAirStation implements AirStation, SensorMaintenance {
    @Override
    public void monitorAirPollution() {
        int airPollutionRange = 10;
        System.out.println("[ADV AIR ST] Monitoring air pollution... | Air pollution:"+ Math.round(Math.random()*airPollutionRange) / airPollutionRange);
    }

    @Override
    public void turnOn() {
        System.out.println("[ADV AIR ST] Sensor turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("[ADV AIR ST] Sensor turned off.");
    }

    @Override
    public void calibrate() {
        System.out.println("[ADV AIR ST] Sensor calibrated.");
    }
}

//Koniec, Tydzień 8, Zasada ISP - implementacja stacji powietrza
