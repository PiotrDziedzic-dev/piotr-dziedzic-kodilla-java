package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowExceptionTest() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling(3,1.5);
        ExceptionHandling exceptionHandling1 = new ExceptionHandling(1.5,5);

        //When & Then
        assertEquals(exceptionHandling.handlingWithException(),"Exception");
        assertEquals(exceptionHandling1.handlingWithException(),"Done!");
    }
    @Test
    void extremeCases() {

        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling(2,0);
        ExceptionHandling exceptionHandling1 = new ExceptionHandling(1,1);
        ExceptionHandling exceptionHandling2 = new ExceptionHandling(1,1.5);

        //When & Then
        assertEquals(exceptionHandling.handlingWithException(),"Exception");
        assertEquals(exceptionHandling1.handlingWithException(),"Done!");
        assertEquals(exceptionHandling2.handlingWithException(),"Exception");

    }

}
