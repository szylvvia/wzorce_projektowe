package com.example.monitoringSystem.lab6.ocpData2;

import java.util.List;

public class OcpCity {
    public void checkWeatherInAllCities(List<ICity> cities) {
        for (ICity city : cities) {
            city.checkWeather();
        }
    }
}
