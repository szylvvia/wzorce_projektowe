package com.example.monitoringSystem.lab5Patterns.observer;

import com.example.monitoringSystem.lab5Patterns.observer.Observer;
import com.example.monitoringSystem.lab5Patterns.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class MeasuringStationO implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, pressure, humidity);
        }
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
}
