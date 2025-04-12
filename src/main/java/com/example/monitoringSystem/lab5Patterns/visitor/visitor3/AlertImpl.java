package com.example.monitoringSystem.lab5Patterns.visitor.visitor3;

class AlertImpl implements AlertVisitor {

    @Override
    public String visit(Country countryStation) {
        StringBuilder alertMessage = new StringBuilder();
        alertMessage.append("\n<COUNTRY ALERT>\n");
        alertMessage.append("  <h2>Alert Level: ").append(countryStation.getAlertLevel()).append(" <h2>\n");
        alertMessage.append("  <h2>Dangerous Level: ").append(countryStation.getDangerousLevel()).append(" <h2>\n");
        alertMessage.append("  <p>Please take necessary precautions.<p>\n");
        alertMessage.append("</COUNTRY ALERT>\n");
        return alertMessage.toString();
    }

    @Override
    public String visit(Department departmentStation) {
        StringBuilder alertMessage = new StringBuilder();
        alertMessage.append("\n");
        alertMessage.append("\"DEPARTMENT REPORT\": [\n");
        alertMessage.append("\t{\n");
        alertMessage.append("  \t\t\"Department\": \"").append(departmentStation.getDepartmentName()).append("\",\n");
        alertMessage.append("   \t\t\"Alert Level\": \"").append(departmentStation.getAlertLevel()).append("\",\n");
        alertMessage.append("\t}\n");
        alertMessage.append("]\n");
        return alertMessage.toString();
    }
}
