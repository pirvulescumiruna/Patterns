package mriuna.pirvulescu.tema.factory;

import mriuna.pirvulescu.tema.domain.Report;

public class IndividualReport extends Report {
    String title;
    String studentName;
    Double performance;

    public IndividualReport(String title, String studentName, Double performance) {
        this.title = title;
        this.studentName = studentName;
        this.performance = performance;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Double getPerformance() {
        return this.performance;
    }

    @Override
    public void printReport() {
        System.out.println(title + " " + performance + " " + studentName);
    }
}
