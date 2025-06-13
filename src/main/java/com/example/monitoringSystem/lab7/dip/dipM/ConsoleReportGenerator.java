//Tydzień 8, Zasada DIP (Dependency Inversion Principle), generator raportów konsolowych
//Konkretna implementacja abstrakcji IReportGenerator zgodnie z zasadą DIP
//Szczegół implementacyjny, który nie wpływa na moduły wysokopoziomowe używające abstrakcji
package com.example.monitoringSystem.lab7.dip.dipM;

public class ConsoleReportGenerator extends AbstractReportGenerator {
    @Override
    public void generateReport(double result) {
        System.out.println("Średnia z pomiarów: " + result);
    }
}
//Koniec, Tydzień 8, Zasada DIP - generator konsolowy