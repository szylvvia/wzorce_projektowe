//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs sensora
//Przykład złego projektowania - wymusza implementację wszystkich funkcji sensora
//Klienci muszą implementować odczyt, kalibrację, reset i status nawet jeśli używają tylko jednej funkcji
package com.example.monitoringSystem.lab7.isp.ispM;

public interface ISensor {
    double readValue();
    void calibrate();
    void reset();
    void displayStatus();
}

//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczny sensor
