package com.example.monitoringSystem.lab6.ocpAbstract2;

import java.util.List;

public class OcpCity {
    public void updateWeatherInAllCity(List<ACity> cityList) {
        cityList.forEach(ACity::updateWeather);
    }
}
