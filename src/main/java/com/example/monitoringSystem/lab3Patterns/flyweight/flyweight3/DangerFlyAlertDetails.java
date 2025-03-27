package com.example.monitoringSystem.lab3Patterns.flyweight.flyweight3;

import java.util.HashMap;
import java.util.Map;

public class DangerFlyAlertDetails implements AbstractFlyAlert {
    private Map<String,String> alertDetails;
    private String alertType;
    private String alertContent;

    public DangerFlyAlertDetails(String alertType, String alertContent) {
        this.alertType = alertType;
        this.alertContent = alertContent;
    }

    public String getAlertType() {
        return alertType;
    }

    public String getAlertContent() {
        return alertContent;
    }

    @Override
    public Map<String, String> getAlertDetails() {
        alertDetails = new HashMap<String,String>();
        alertDetails.put("Alert type", alertType);
        alertDetails.put("Content", alertContent);
        return alertDetails;
    }
}
