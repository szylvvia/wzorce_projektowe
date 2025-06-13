//Tydzień 8, Zasada ISP - podstawowy interfejs stacji środowiskowej
//Segregacja interfejsu - wspólne funkcje dla wszystkich typów stacji
//Zgodnie z ISP - zawiera tylko niezbędne metody podstawowe
package com.example.monitoringSystem.lab7.isp.ispS.isp3;

//Tydzień 8, Zasada ISP (Interface Segregation Principle), naruszenie ISP - zbyt szeroki interfejs wymuszający implementację niepotrzebnych metod
public interface EnvironmentalStation {
    void turnOn();
    void turnOff();
    void calibrate();
    void monitorAirPollution();
    void monitorWaterQuality();
    void monitorSoilHumidity();

}
//Koniec, Tydzień 8, Zasada ISP - interfejs stacji środowiskowej
