package com.example.monitoringSystem.controllers;

import com.example.monitoringSystem.lab3Patterns.Proxy.P1.VirtualMeasuringStationProxy;
import com.example.monitoringSystem.lab3Patterns.Proxy.P2.ProtectionMeasuringStationProxy;
import com.example.monitoringSystem.lab3Patterns.Proxy.P3.RemoteMeasuringStationProxy;
import com.example.monitoringSystem.lab3Patterns.facade.AlertFacade.AlertFacade;
import com.example.monitoringSystem.lab3Patterns.facade.MeasurementFacade.MeasurementFacade;
import com.example.monitoringSystem.lab3Patterns.facade.ReportFacade.CsvReportGeneratorFacade;
import com.example.monitoringSystem.lab3Patterns.facade.ReportFacade.JsonReportGeneratorFacade;
import com.example.monitoringSystem.lab3Patterns.facade.ReportFacade.PdfReportGeneratorFacade;
import com.example.monitoringSystem.lab3Patterns.facade.ReportFacade.ReportFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Lab3Controller {

    @GetMapping("/lab3")
    public String showLab3Page(Model model) {

        //----Proxy----//
        // P1 - Virtual Proxy
        VirtualMeasuringStationProxy proxyP1 = new VirtualMeasuringStationProxy();
        String resultP1 = proxyP1.getDataP1();

        // P2 - Protection Proxy
        ProtectionMeasuringStationProxy proxyP2 = new ProtectionMeasuringStationProxy();
        String resultP2Guest = proxyP2.getDataP2("guest");
        String resultP2Admin = proxyP2.getDataP2("admin");

        // P3 - Remote Proxy
        RemoteMeasuringStationProxy proxyP3 = new RemoteMeasuringStationProxy();
        String resultP3 = proxyP3.getDataP3();

        model.addAttribute("resultP1", resultP1);
        model.addAttribute("resultP2Guest", resultP2Guest);
        model.addAttribute("resultP2Admin", resultP2Admin);
        model.addAttribute("resultP3", resultP3);

        //----Facade----//

        // Report Facade
        ReportFacade reportFacadePdf = new ReportFacade(new PdfReportGeneratorFacade());
        String pdfReport = reportFacadePdf.generateEnvironmentalReport();

        ReportFacade reportFacadeCsv = new ReportFacade(new CsvReportGeneratorFacade());
        String csvReport = reportFacadeCsv.generateEnvironmentalReport();

        ReportFacade reportFacadeJson = new ReportFacade(new JsonReportGeneratorFacade());
        String jsonReport = reportFacadeJson.generateEnvironmentalReport();

        model.addAttribute("pdfReport", pdfReport);
        model.addAttribute("csvReport", csvReport);
        model.addAttribute("jsonReport", jsonReport);

        // Measurement Facade
        MeasurementFacade measurementFacade = new MeasurementFacade();
        model.addAttribute("temperature", measurementFacade.getTemperature());
        model.addAttribute("humidity", measurementFacade.getHumidity());
        model.addAttribute("pressure", measurementFacade.getPressure());

        // Alert Facade
        AlertFacade alertFacade = new AlertFacade();
        alertFacade.sendSmsAlert("Temperature too high!");
        alertFacade.sendEmailAlert("Pressure dropping rapidly!");
        alertFacade.sendPushNotification("Humidity level critical!");



        return "lab3";
    }
}
