package mriuna.pirvulescu.tema;

import mriuna.pirvulescu.tema.domain.Assignment;
import mriuna.pirvulescu.tema.domain.Report;
import mriuna.pirvulescu.tema.domain.Student;
import mriuna.pirvulescu.tema.enums.ReportType;
import mriuna.pirvulescu.tema.factory.ReportFactory;
import mriuna.pirvulescu.tema.singleton.StudLogger;

import java.io.IOException;

public class TestAssignment {

    public static void main(String[] args) throws IOException {

       //1 Test Singleton pattern
        StudLogger logger1 = StudLogger.getInstance();
        StudLogger logger2 = StudLogger.getInstance();

        Assignment assignment1 = new Assignment("CTS assignment 1");
        logger1.logAssignmentInfo(assignment1,"assignment was created");

        Assignment assignment2 = new Assignment("CTS assignment 2");
        logger2.logAssignmentInfo(assignment2,"cts assignemnt 2 was created");

        assignment1.setGrade(10);
        logger1.logAssignmentInfo(assignment1,"assignment 1 was graded with" + assignment1.getGrade());

        assignment1.setGrade(5);
        logger2.logAssignmentInfo(assignment1,"assignment 2 was graded with" + assignment2.getGrade());

       Student student = new Student("Marcel", 1094);

       logger1.closeWriter();

       //2 test Factory pattern
        System.out.println("\n");
        System.out.println("<------------------------>");
        System.out.println("\n");
        Report individualReport = ReportFactory.getReport(ReportType.INDIVIDUAL,
                "Student individual performance report",67.8,student.getName());
        Report collectiveReport = ReportFactory.getReport(ReportType.INDIVIDUAL,
                "Series collective performance report",55.5,"G");

        individualReport.printReport();
        collectiveReport.printReport();
    }

}
