package com.example.monitoringSystem.lab9.AspectJ3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

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
