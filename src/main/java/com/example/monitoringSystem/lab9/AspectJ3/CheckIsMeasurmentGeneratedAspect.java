//Tydzień 11, AOP - aspekt walidacji generowania pomiarów
//Sprawdza czy pomiary są prawidłowo generowane przed tworzeniem raportów
//Automatyczna walidacja danych wejściowych bez modyfikacji kodu biznesowego
package com.example.monitoringSystem.lab9.AspectJ3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.List;

//Tydzień 11, AspectJ AOP, Aspekt sprawdzający czy pomiary zostały wygenerowane
@Aspect
@Component
public class CheckIsMeasurmentGeneratedAspect {

    @Before("execution(* com.example.monitoringSystem.lab9.AspectJ3.ReportGeneratorService.sendReport(..))")
    public void checkBeforeSending(JoinPoint joinPoint) throws Throwable {
        Object target = joinPoint.getTarget();

        if (target instanceof ReportGeneratorService) {
            ReportGeneratorService service = (ReportGeneratorService) target;

            Field field = ReportGeneratorService.class.getDeclaredField("dataMeasurements");
            field.setAccessible(true);

            List<Double> measurements = (List<Double>) field.get(service);

            if (measurements == null || measurements.isEmpty()) {
                System.err.println("[ASPECT] Measurements list is empty or not initialized. Cannot send report.");
            } else {
                System.out.println("[ASPECT] Measurements list is valid (item: "+measurements.size()+"). Proceeding to send report.");
            }
        }
    }
}
//Koniec, Tydzień 11, AOP - aspekt walidacji pomiarów
