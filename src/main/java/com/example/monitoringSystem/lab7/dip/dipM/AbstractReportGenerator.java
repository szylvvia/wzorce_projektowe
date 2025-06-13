//Tydzień 8, Zasada DIP (Dependency Inversion Principle), abstrakcyjny generator raportów
//Implementuje bazową funkcjonalność generowania raportów zgodnie z DIP
//Pozwala na rozszerzanie o nowe typy raportów bez wpływu na moduły wysokopoziomowe
package com.example.monitoringSystem.lab7.dip.dipM;

public abstract class AbstractReportGenerator implements IReportGenerator {
    public abstract void generateReport(double result);
}
//Koniec, Tydzień 8, Zasada DIP - abstrakcyjny generator