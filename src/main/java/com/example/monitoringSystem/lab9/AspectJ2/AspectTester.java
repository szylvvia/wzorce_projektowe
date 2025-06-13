//Tydzień 11, AOP - tester aspektów zaawansowanych
//Demonstruje zastosowanie różnych typów aspektów w systemie monitoringu
//Pokazuje automatyczne wykrywanie anomalii i odświeżanie konfiguracji
package com.example.monitoringSystem.lab9.AspectJ2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Tydzień 11, AspectJ AOP, Tester aspektów dla systemu monitoringu - druga implementacja
@SpringBootApplication(scanBasePackages = "com.example.monitoringSystem")
@EnableAspectJAutoProxy
public class AspectTester implements CommandLineRunner {

    private final MonitoringSystemService monitoringSystemService;

    public AspectTester(MonitoringSystemService monitoringSystemService) {
        this.monitoringSystemService = monitoringSystemService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AspectTester.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("=== AOP Tester: Monitoring System ===");

        monitoringSystemService.saveMeasurement("TEMP-1", 23.5);
        monitoringSystemService.saveMeasurement("TEMP-2", 27.8);
        monitoringSystemService.updateConfig("samplingRate=5s");

        for (int i = 0; i < 5; i++) {
            monitoringSystemService.readTemperature();
        }

        monitoringSystemService.updateConfig("thresholdTemp=45");
        monitoringSystemService.saveMeasurement("TEMP-3", 99.1);

        System.out.println("=== AOP Test Finished ===");
        System.out.println();
    }
}
//Koniec, Tydzień 11, AOP - tester aspektów zaawansowanych
