package com.example.monitoringSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Główna klasa aplikacji Spring Boot
//System monitoringu demonstrujący wzorce projektowe i zasady SOLID
//Laboratoria: Factory, Singleton, Builder, Prototype, Adapter, Bridge, Composite, Decorator, Facade, Proxy, Flyweight,
//Command, Memento, Iterator, Mediator, Observer, Strategy, Template Method, Visitor, SRP, OCP, LSP, ISP, DIP,
//Programowanie funkcyjne, Stream API, AspectJ
@SpringBootApplication
public class MonitoringSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringSystemApplication.class, args);
	}

}
