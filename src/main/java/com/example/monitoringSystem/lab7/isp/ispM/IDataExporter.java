package com.example.monitoringSystem.lab7.isp.ispM;

//Tydzień 8, Zasada ISP - naruszenie ISP przez monolityczny interfejs eksportu danych
//Przykład złego projektowania - wymusza implementację wszystkich formatów eksportu
//Klienci muszą implementować CSV, PDF i upload do chmury nawet jeśli używają tylko jednego
public interface IDataExporter {
    void exportToCSV();
    void exportToPDF();
    void uploadToCloud();
}
//Koniec, Tydzień 8, Zasada ISP - naruszenie przez monolityczny eksporter
