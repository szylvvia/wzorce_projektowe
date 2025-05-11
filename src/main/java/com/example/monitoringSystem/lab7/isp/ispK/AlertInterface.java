package com.example.monitoringSystem.lab7.isp.ispK;

public interface AlertInterface {
    void sendEmailAlert(String msg);
    void sendSmsAlert(String msg);
    void sendPushNotification(String msg);
}
