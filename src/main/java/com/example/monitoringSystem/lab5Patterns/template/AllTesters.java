package com.example.monitoringSystem.lab5Patterns.template;

import com.example.monitoringSystem.lab5Patterns.template.template1.TemplateTester;
import com.example.monitoringSystem.lab5Patterns.template.template2.ReportPatternTester;
import com.example.monitoringSystem.lab5Patterns.template.template3.AnalyzerTester;

public class AllTesters {
    public static void main(String[] args) {
        System.out.println("############# TEMPLATE 1 ############# \n");
        TemplateTester.main(args);
        System.out.println("############# TEMPLATE 2 ############# \n");
        ReportPatternTester.main(args);
        System.out.println("############# TEMPLATE 3 ############# \n");
        AnalyzerTester.main(args);
    }
}
