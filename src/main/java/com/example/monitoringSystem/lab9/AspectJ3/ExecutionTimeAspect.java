//Tydzień 11, AOP - aspekt pomiaru czasu wykonania raportów
//Automatyczny pomiar czasu generowania różnych typów raportów
//Performance monitoring oddzielony od logiki biznesowej
package com.example.monitoringSystem.lab9.AspectJ3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//Tydzień 11, AspectJ AOP, Aspekt mierzący czas wykonania operacji generowania raportów
@Aspect
@Component
public class ExecutionTimeAspect {
    @Around("execution(* com.example.monitoringSystem.lab9.AspectJ3.ReportGeneratorService.generateReport(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("[ASPECT] Generating report started (" + start + ") ");
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("[ASPECT] Report generation finished (" + end + ") ---> Duration: " + (end - start) + "ms");
        return result;
    }
}
//Koniec, Tydzień 11, AOP - aspekt pomiaru czasu raportów
