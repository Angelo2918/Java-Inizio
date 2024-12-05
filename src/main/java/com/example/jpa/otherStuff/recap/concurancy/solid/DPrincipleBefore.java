package com.example.jpa.otherStuff.recap.concurancy.solid;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DPrincipleBefore {
}


class ConsoleLogger {
    public void log(String message) {
        System.out.println(message);
    }
}


class FileLogger {
    public void log(String message) {
        File logFile = new File("path/filename.log");
        try (FileWriter fw = new FileWriter(logFile, true)){
            fw.write(message + "\n");
        }catch(IOException e ){
            e.printStackTrace();
        }

    }
}