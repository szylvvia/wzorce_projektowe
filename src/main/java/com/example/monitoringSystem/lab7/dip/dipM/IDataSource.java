//Tydzień 8, Zasada DIP - interfejs źródła danych
//Dependency Inversion Principle - wysokopoziomowe moduły zależą od abstrakcji
//Definiuje kontrakt dla różnych implementacji źródeł danych pomiarowych
package com.example.monitoringSystem.lab7.dip.dipM;

public interface IDataSource{
    double[] fetchData();
}
//Koniec, Tydzień 8, Zasada DIP - interfejs
