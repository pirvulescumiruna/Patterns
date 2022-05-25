package mriuna.pirvulescu.tema.factory;

import mriuna.pirvulescu.tema.domain.Report;

public class CollectiveReport extends Report {
    String title;
    String series;
    Double performance;

    public CollectiveReport(String title, String series, Double performance) {
        this.title = title;
        this.series = series;
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
        System.out.println(title + " " + performance + " " + series);
    }
}
