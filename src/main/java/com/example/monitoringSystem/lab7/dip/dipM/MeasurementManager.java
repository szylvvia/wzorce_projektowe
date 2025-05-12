package com.example.monitoringSystem.lab7.dip.dipM;

public class MeasurementManager {

    private final IDataSource dataSource;
    private final IMeasurementProcessor processor;
    private final IReportGenerator reportGenerator;

    public MeasurementManager(IDataSource dataSource,
                              IMeasurementProcessor processor,
                              IReportGenerator reportGenerator) {
        this.dataSource = dataSource;
        this.processor = processor;
        this.reportGenerator = reportGenerator;
    }

    public void run() {
        double[] data = dataSource.fetchData();
        double result = processor.process(data);
        reportGenerator.generateReport(result);
    }

    public static void main(String[] args) {
        // Dependency Inversion in action:
        IDataSource source = new FileDataSource();
        IMeasurementProcessor processor = new AverageProcessor();
        IReportGenerator reporter = new ConsoleReportGenerator();

        MeasurementManager manager = new MeasurementManager(source, processor, reporter);
        manager.run();
    }
}
