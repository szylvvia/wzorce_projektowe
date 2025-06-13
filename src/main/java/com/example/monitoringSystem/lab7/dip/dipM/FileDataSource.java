//Tydzień 8, Zasada DIP - konkretne źródło danych z pliku
//Rozszerza AbstractDataSource implementując konkretny sposób pobierania danych
//Demonstruje implementację konkretnego źródła zgodnie z DIP
package com.example.monitoringSystem.lab7.dip.dipM;

public class FileDataSource extends AbstractDataSource {
    @Override
    public double[] fetchData() {
        return new double[] {22.5, 33.1, 21.8};  // dummy file read
    }
}

//Koniec, Tydzień 8, Zasada DIP - źródło danych z pliku