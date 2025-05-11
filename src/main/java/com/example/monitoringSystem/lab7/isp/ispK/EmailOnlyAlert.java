package com.example.monitoringSystem.lab7.isp.ispK;

public class EmailOnlyAlert implements EmailAlert {
    @Override
    public void sendEmailAlert(String msg) {
        System.out.println("Sending email alert: " + msg);
    }
}
