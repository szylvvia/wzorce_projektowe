package com.example.monitoringSystem.lab2Patterns.bridge.BridgePatternCommunication;

public class BridgePatternCommunication {
    public static void main(String[] args) {
        // Weather station using HTTP communication
        CommunicatingMeasurementStation weatherStation = new WeatherStationWithCommunication(new HttpCommunication());
        weatherStation.measureAndSend();

        // Industrial station using MQTT communication
        CommunicatingMeasurementStation industrialStation = new IndustrialStationWithCommunication(new MqttCommunication());
        industrialStation.measureAndSend();
    }
}

