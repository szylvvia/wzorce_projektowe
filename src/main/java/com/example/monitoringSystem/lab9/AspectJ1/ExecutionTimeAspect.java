package com.example.monitoringSystem.lab9.AspectJ1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class ExecutionTimeAspect {

    @Around("execution(* com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation.get*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - start;
        System.out.println("[TIME] " + joinPoint.getSignature() + " executed in " + duration + " ms");
        return result;
    }
}
