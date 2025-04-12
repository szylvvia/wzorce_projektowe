package com.example.monitoringSystem.lab5Patterns.visitor;

import com.example.monitoringSystem.lab5Patterns.visitor.visitor1.VisitorTester1;
import com.example.monitoringSystem.lab5Patterns.visitor.visitor2.VisitorTester2;
import com.example.monitoringSystem.lab5Patterns.visitor.visitor3.VisitorTester3;

public class AllTesterVisitor {
    public static void main(String[] args) {
        System.out.println("############# VISITOR 1 ############# \n");
        VisitorTester1.main(args);
        System.out.println("############# VISITOR 2 ############# \n");
        VisitorTester2.main(args);
        System.out.println("############# VISITOR 3 ############# \n");
        VisitorTester3.main(args);
    }
}
