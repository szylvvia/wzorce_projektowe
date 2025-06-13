//Tydzień 8, Zasada ISP - podstawowa implementacja sensora zgodnie z ISP
//Implementuje tylko interfejs IReadSensor - nie jest obciążona niepotrzebnymi metodami
//Przykład dobrego projektowania zgodnego z Interface Segregation Principle
package com.example.monitoringSystem.lab7.isp.ispM.ISensorFile;

public class BasicSensor implements IReadSensor, ICalibratable, IResettable, IStatusDisplayable {

    @Override
    public double readValue() {
        System.out.println("Sensor: odczytuję wartość...");
        return 20.0;
    }

    @Override
    public void calibrate() {
        System.out.println("Sensor: kalibracja...");
    }

    @Override
    public void reset() {
        System.out.println("Sensor: reset...");
    }

    @Override
    public void displayStatus() {
        System.out.println("Sensor: status OK.");
    }
}

//Koniec, Tydzień 8, Zasada ISP - podstawowy sensor
