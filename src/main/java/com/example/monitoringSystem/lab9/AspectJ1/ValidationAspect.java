package com.example.monitoringSystem.lab9.AspectJ1;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;

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
