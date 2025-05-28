package com.example.monitoringSystem.lab9.AspectJ3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

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
