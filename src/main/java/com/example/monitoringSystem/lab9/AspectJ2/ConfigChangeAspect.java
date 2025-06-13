//Tydzień 11, AOP - aspekt zmian konfiguracji
//Automatyczne wykrywanie i obsługa zmian w konfiguracji systemu
//Reaguje na zmiany parametrów bez ingerencji w kod biznesowy
package com.example.monitoringSystem.lab9.AspectJ2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//Tydzień 11, AspectJ AOP, Aspekt reagujący na zmiany konfiguracji systemu
@Aspect
@Component
public class ConfigChangeAspect {

    private final Map<String, String> configChanges = new LinkedHashMap<>();

    @After("execution(* com.example.monitoringSystem.lab9.AspectJ2.MonitoringSystemService.updateConfig(..)) && args(newConfig)")
    public void trackUserConfigurationChange(String newConfig) {
        String timestamp = new Date().toString();
        configChanges.put(timestamp, newConfig);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("config_changes.log", true))) {
            writer.write("[" + timestamp + "] Config changed to: " + newConfig + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> getConfigChanges() {
        return Collections.unmodifiableMap(configChanges);
    }
}
//Koniec, Tydzień 11, AOP - aspekt konfiguracji

