package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    Logger logger;

    @Test
    void getLastLog() {

        //Given
        logger = Logger.LOGGER;
        //When
        logger.log("ABC");
        //Then
        Assertions.assertEquals(logger.getLastLog(),"ABC");

    }
}
