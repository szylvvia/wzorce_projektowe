package com.example.monitoringSystem.controllers;

import com.example.monitoringSystem.lab3Patterns.Proxy.P1.VirtualMeasuringStationProxy;
import com.example.monitoringSystem.lab3Patterns.Proxy.P2.ProtectionMeasuringStationProxy;
import com.example.monitoringSystem.lab3Patterns.Proxy.P3.RemoteMeasuringStationProxy;
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



        return "lab3";
    }
}
