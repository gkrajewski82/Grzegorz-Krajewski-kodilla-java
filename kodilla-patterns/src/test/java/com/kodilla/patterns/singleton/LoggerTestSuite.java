package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLasLog() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("Log nr. 1");

        //When
        String lastLog = logger.getLastLog();

        //Then
        assertEquals("Log nr. 1", lastLog);
    }
}
