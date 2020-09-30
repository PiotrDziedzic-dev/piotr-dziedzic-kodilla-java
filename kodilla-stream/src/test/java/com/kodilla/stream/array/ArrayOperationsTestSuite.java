package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.kodilla.stream.array.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int tablica[] = new int[5];
        tablica[0] = 5;
        tablica[1] = 6;
        tablica[2] = 7;
        tablica[3] = 8;
        tablica[4] = 9;

        //When
        double expectedAverage = ArrayOperations.getAverage(tablica);

        //Then
        Assertions.assertEquals(7,expectedAverage);
    }
}
