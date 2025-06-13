package com.example.monitoringSystem.lab7.isp.ispM;

//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs kontroli stacji
//Przykład złego projektowania - wymusza implementację wszystkich operacji kontrolnych
//Klienci muszą implementować start, stop, pause, resume i restart nawet jeśli używają tylko niektórych

public interface IStationControl {
    void start();
    void stop();
    void pause();
    void resume();
    void restart();
}

//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczny kontroler
