//Tydzień 11, AOP - aspekt liczenia wygenerowanych raportów
//Automatyczne zliczanie ilości tworzonych raportów w systemie
//Monitoring statystyk bez ingerencji w logikę generowania raportów
package com.example.monitoringSystem.lab9.AspectJ3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// Tydzień 11, AspectJ AOP, Aspekt liczący ilość wygenerowanych raportów
@Aspect
@Component
public class CountGeneratedReportsAspect {

    private int reportCounter = 0;

    @After("execution(* com.example.monitoringSystem.lab9.AspectJ3.ReportGeneratorService.generateReport(..))")
    public void incrementReportCounter() {
        reportCounter++;
        System.out.println("[ASPECT] Number of reports generated so far: " + reportCounter);
    }
}
// Koniec, Tydzień 11, AOP - aspekt liczenia raportów
