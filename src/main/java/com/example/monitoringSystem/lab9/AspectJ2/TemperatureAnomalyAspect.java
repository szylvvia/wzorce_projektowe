//Tydzień 11, AOP - aspekt wykrywania anomalii temperaturowych
//Automatyczne monitorowanie i alertowanie o nieprawidłowych temperaturach
//Crosscutting concern oddzielony od logiki pomiarowej
package com.example.monitoringSystem.lab9.AspectJ2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

//Tydzień 11, AspectJ AOP, Aspekt monitorujący anomalie temperaturowe w systemie
@Aspect
@Component
public class TemperatureAnomalyAspect {

    private final List<String> activeAlerts = new ArrayList<>();

    @AfterReturning(
            pointcut = "execution(* com.example.monitoringSystem.lab9.AspectJ2.MonitoringSystemService.readTemperature(..))",
            returning = "temperature")
    public void detectAnomaly(Double temperature) {
        double anomalyTemp = 50.0;
        if (temperature != null && temperature > anomalyTemp) {
            String alert = "ALERT! High temperature detected: " + temperature + "°C at " + new Date();
            activeAlerts.add(alert);
            System.err.println(alert);
        }
    }

    public List<String> getActiveAlerts() {
        return Collections.unmodifiableList(activeAlerts);
    }
}
//Koniec, Tydzień 11, AOP - aspekt anomalii temperaturowych
