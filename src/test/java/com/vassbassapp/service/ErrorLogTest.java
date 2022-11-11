package com.vassbassapp.service;

import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ErrorLogTest {

    private ErrorLog errorLog;

    private static File logFile, tempFile;

    @BeforeClass
    public static void createTempFile() throws IOException {
        logFile = new File("errors", LocalDate.now() + ".log");
        if (logFile.exists()) {
            tempFile = new File("temp.log");
            Files.copy(logFile.toPath(), tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    @Before
    public void initLog() {
        errorLog = ErrorLog.getInstance();
    }

    @After
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void clearLog() {
        logFile.delete();
    }

    @AfterClass
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void clearTemp() throws IOException {
        if (tempFile != null && tempFile.exists()) {
            Files.copy(tempFile.toPath(), logFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            tempFile.delete();
        }
    }

    @Test
    public void getInstance() {
        assertSame(errorLog, ErrorLog.getInstance());
    }

    @Test
    public void appendString() throws IOException {
        StringBuilder expected = new StringBuilder();

        errorLog.appendString("String 1");
        expected.append("\n")
                .append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")))
                .append("String 1");

        assertEquals(expected.toString(), Files.readString(logFile.toPath()));

        errorLog.appendString("String 2");
        expected.append("\n")
                .append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")))
                .append("String 2");

        assertEquals(expected.toString(), Files.readString(logFile.toPath()));
    }
}