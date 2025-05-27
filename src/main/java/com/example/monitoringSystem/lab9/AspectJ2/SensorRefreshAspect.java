package com.example.monitoringSystem.lab9.AspectJ2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
public class SensorRefreshAspect {

    private final List<LocalDateTime> refreshLog = new ArrayList<>();

    @After("execution(* com.example.monitoringSystem.lab9.AspectJ2.MonitoringSystemService.saveMeasurement(..))")
    public void logSensorRefresh() {
        LocalDateTime now = LocalDateTime.now();
        refreshLog.add(now);
        System.out.println("[Aspect] Sensor refreshed at: " + now);
    }

    public List<LocalDateTime> getRefreshLog() {
        return refreshLog;
    }
}
