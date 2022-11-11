package com.vassbassapp.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Singleton
 */
public class ErrorLog implements LogManager {
    private static volatile ErrorLog instance;
    private final File dir = new File("errors");
    private final File log = new File(dir, LocalDate.now() + ".log");

    private ErrorLog() throws IOException {}

    public static ErrorLog getInstance() {
        if (instance == null) {
            synchronized (ErrorLog.class) {
                if (instance == null) {
                    try {
                        instance = new ErrorLog();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }

    @Override
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void appendString(String string) {
        try {
            if (!dir.exists()) dir.mkdirs();
            if (!log.exists()) log.createNewFile();

            String toPrint = "\n" +
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) +
                    string;
            Files.write(log.toPath(), toPrint.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
