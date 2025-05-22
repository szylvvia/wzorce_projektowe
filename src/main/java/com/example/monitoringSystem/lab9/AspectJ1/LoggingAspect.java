package com.example.monitoringSystem.lab9.AspectJ1;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation.get*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("[LOG] Starting data retrieval: " + joinPoint.getSignature());
    }

    @After("execution(* com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation.get*(..))")
    public void after() {
        System.out.println("[LOG] Data retrieval complete.");
    }
}
