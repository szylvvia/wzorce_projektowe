package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Tydzień 4, Flyweight Pattern, Tester demonstrujący efektywność pamięciową wzorca dla alertów
public class AlertTester {
    private List<Alert> alerts = new ArrayList<>();

    public AlertTester()
    {
        int loopCount = 10;
        for(int i=0; i<loopCount; i++) {
        appendAlertWithData(DangerFlyAlertDetailsFactory.AlertType.LOW);
        }
        for(int i=0; i<loopCount; i++) {
            appendAlertWithData(DangerFlyAlertDetailsFactory.AlertType.MEDIUM);
        }
        for(int i=0; i<loopCount; i++) {
            appendAlertWithData(DangerFlyAlertDetailsFactory.AlertType.HIGH);
        }
    }
    private void appendAlertWithData(DangerFlyAlertDetailsFactory.AlertType al){
        DangerFlyAlertDetails alertData = DangerFlyAlertDetailsFactory.getAlertDetails(al);
        Date date = new Date();
        int value2 = (int) (Math.random() * 10000000);
        Alert alert = new Alert(date, "Localization" + value2);
        alert.setAlertDetails(alertData);
        System.out.println(alert);
        alerts.add(alert);
    }

    public static void main(String[] args) {
        System.out.println("--- Flyweight pattern 3 ---");
        AlertTester alertTester = new AlertTester();
    }
}
//Koniec, Tydzień 4, Flyweight Pattern
