//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjne źródło danych
//Łączy interfejs z bazową implementacją zgodnie z zasadą odwrócenia zależności
//Pozwala na tworzenie konkretnych źródeł danych bez wpływu na moduły wysokopoziomowe
package com.example.monitoringSystem.lab7.dip.dipM;

public abstract class AbstractDataSource implements IDataSource {
    public abstract double[] fetchData();
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjne źródło
