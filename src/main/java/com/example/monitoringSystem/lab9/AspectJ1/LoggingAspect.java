//Tydzień 11, AOP - aspekt logowania dla stacji pomiarowej
//Separacja zagadnień przekrojowych - automatyczne logowanie wywołań metod
//Demonstruje zastosowanie programowania aspektowego w systemie monitoringu
package com.example.monitoringSystem.lab9.AspectJ1;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;

//Tydzień 11, Aspect Oriented Programming 2
//Aspekt logowania - automatyczne logowanie przed i po wykonaniu metod
//Wykorzystuje adnotacje @Before i @After do definiowania punktów przecięcia
@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation.get*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("[LOG] Starting data retrieval: " + joinPoint.getSignature());
    }    @After("execution(* com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation.get*(..))")
    public void after() {
        System.out.println("[LOG] Data retrieval complete.");
    }
}
//Koniec, Tydzień 11, AOP - aspekt logowania
