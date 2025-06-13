//Tydzień 8, Zasada DIP (Dependency Inversion Principle), dane dziennego raportu
//Konkretna implementacja abstrakcji IReport zgodnie z zasadą DIP
//Niskpoziomowy moduł dostarczający dane, który może być zastąpiony bez wpływu na logikę raportowania
package com.example.monitoringSystem.lab7.dip.dipS.dip2;

public class DailyReportData implements IReport {

    @Override
    public Double getDataToReport() {
        int randomValueRange = 100;
        return (double) Math.round(Math.random() * randomValueRange);
    }
}
//Koniec, Tydzień 8, Zasada DIP - dane dziennego raportu
