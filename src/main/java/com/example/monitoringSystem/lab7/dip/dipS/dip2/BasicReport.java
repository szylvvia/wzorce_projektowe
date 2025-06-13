//Tydzień 8, Zasada DIP (Dependency Inversion Principle), podstawowy generator raportów
//Konkretna implementacja abstrakcji ReportGenerator zgodnie z DIP
//Demonstruje walidację danych i obsługę wyjątków w kontekście zasady DIP
package com.example.monitoringSystem.lab7.dip.dipS.dip2;

import com.example.monitoringSystem.lab7.dip.dipS.exceptions.EmptyReportTitleException;
import com.example.monitoringSystem.lab7.dip.dipS.exceptions.FutureDateException;

import java.time.LocalDate;

public class BasicReport extends ReportGenerator {

    public BasicReport(IReport report) {
        super(report);
    }

    @Override
    public void generateReport(String title, String date) {
        LocalDate inputDate = LocalDate.parse(date);
        LocalDate currentDate = LocalDate.now();
        if (inputDate.isAfter(currentDate)) {
            throw new FutureDateException("Data nie może być w przyszłości");
        }

        if (title == null || title.isEmpty()) {
            throw new EmptyReportTitleException("Nie można wygenerować raportu bez tytułu");
        }

        Double data = report.getDataToReport();
        System.out.println("Generowanie podstawowego raportu...");
        System.out.println(title+" | "+date+" | wartosc: "+data);
    }
}
//Koniec, Tydzień 8, Zasada DIP - podstawowy raport
