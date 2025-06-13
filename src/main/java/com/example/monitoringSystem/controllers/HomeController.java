package com.example.monitoringSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Spring Boot Controller, główny kontroler aplikacji webowej systemu monitoringu środowiskowego
//Obsługuje routing i nawigację między różnymi laboratoriami wzorców projektowych
@Controller
public class HomeController {

    //Obsługuje żądania GET dla ścieżki głównej "/" - strona startowa aplikacji
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
//Koniec, Spring Boot Controller