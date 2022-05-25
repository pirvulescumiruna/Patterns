package mriuna.pirvulescu.tema.factory;

import mriuna.pirvulescu.tema.domain.Report;
import mriuna.pirvulescu.tema.enums.ReportType;

public class ReportFactory {
    public static Report getReport(ReportType reportType, String title, Double performance, String toEvaluate){
        if(reportType == null){
            return null;
        }
        if(reportType.equals(ReportType.INDIVIDUAL)){
            return new IndividualReport(title,toEvaluate,performance);

        } else if(reportType.equals(ReportType.COLLECTIVE)){
            return new CollectiveReport(title,toEvaluate,performance);
        }
        return null;
    }
}
