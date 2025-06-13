package com.example.monitoringSystem.lab9.AspectJ3;

//Tydzień 11, AOP - główny tester aspektów zaawansowanych
//Demonstruje kompleksowe zastosowanie AspectJ w systemie raportowania
//Automatyczny pomiar czasu, liczenie raportów i walidacja pomiarów
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Tydzień 11, AspectJ AOP, Tester aspektów dla generatora raportów - trzecia implementacja
@SpringBootApplication(scanBasePackages = "com.example.monitoringSystem")
@EnableAspectJAutoProxy
public class Aspect3Tester implements CommandLineRunner {

    private final ReportGeneratorService reportGeneratorService;

    public Aspect3Tester(ReportGeneratorService reportGeneratorService) {
        this.reportGeneratorService = reportGeneratorService;
    }

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(Aspect3Tester.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("--- START --- ASPECTJ 3: Report Generator Service ---");

        String report1 = reportGeneratorService.generateReport("2025-05-28");
        reportGeneratorService.sendReport();
        reportGeneratorService.archiveReport();
        String report2 = reportGeneratorService.generateReport("2025-05-29");

        System.out.println("--- END --- ASPECTJ 3: Report Generator Service ---");
        System.out.println();
    }

}
//Koniec, Tydzień 11, AOP - główny tester aspektów
