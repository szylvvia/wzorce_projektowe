//Tydzień 11, AOP - aspekt walidacji danych pomiarowych
//Automatyczna walidacja parametrów przed wykonaniem metod biznesowych
//Separacja logiki walidacji od głównej logiki aplikacji
package com.example.monitoringSystem.lab9.AspectJ1;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;

//Tydzień 11, AOP (Aspect-Oriented Programming), aspekt walidacji pomiarów temperatury
@Aspect
public class ValidationAspect {
    final int MINTEMP = -50;
    final int MAXTEMP = 60;

    @AfterReturning(
            pointcut = "execution(double com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation.getTemperature())",
            returning = "result"
    )

    public void validateTemperature(double result) {
        if (result < MINTEMP || result > MAXTEMP) {
            System.err.println("[ERROR] Temperature out of valid range: " + result);
        }
    }
}
//Koniec, Tydzień 11, AOP - aspekt walidacji
