//Tydzień 8, Zasada ISP - interfejs dla upload do chmury
//Segregacja interfejsu - specjalistyczny interfejs tylko dla operacji chmurowych
//Zgodnie z ISP - nie wymusza implementacji CSV czy PDF
package com.example.monitoringSystem.lab7.isp.ispM.IDataExporterFile;

public interface ICloudUploadable {
    void uploadToCloud();
}

//Koniec, Tydzień 8, Zasada ISP - interfejs cloud upload