//Tydzień 8, Zasada ISP - prosty kontroler stacji
//Implementuje tylko podstawowe interfejsy kontroli zgodnie z ISP
//Nie jest obciążony wszystkimi możliwymi operacjami kontroli stacji
package com.example.monitoringSystem.lab7.isp.ispM;

import com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile.IStartable;
import com.example.monitoringSystem.lab7.isp.ispM.IStationControlFile.IStoppable;

public class SimpleStationController implements IStartable, IStoppable {
    @Override
    public void start() {
        System.out.println("Stacja wystartowana.");
    }

    @Override
    public void stop() {
        System.out.println("Stacja zatrzymana.");
    }
}

//Koniec, Tydzień 8, Zasada ISP - kontroler stacji