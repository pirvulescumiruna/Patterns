package mriuna.pirvulescu.tema.singleton;

import mriuna.pirvulescu.tema.domain.Assignment;

import java.io.*;
import java.util.Date;

public class StudLogger {

    private static StudLogger logger = null;
    private final String logFile = "C:\\Users\\Miruna\\Desktop\\mriuna\\pirvulescu\\tema\\singleton\\student_logs.txt";
    private PrintWriter writer;
    private StudLogger() {
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(logFile,true)), true);
        } catch (IOException e) {
            System.out.println("Error when opening writer file");
        }
    }

    public static synchronized StudLogger getInstance(){
        if(logger == null)
            logger = new StudLogger();
        return logger;
    }

    public void logAssignmentInfo(Assignment assignment, String description) throws IOException {
        writer.println(new Date() + ": " + assignment.getTitle() + description );
    }

    public void closeWriter() throws IOException {
        writer.close();
    }



}

