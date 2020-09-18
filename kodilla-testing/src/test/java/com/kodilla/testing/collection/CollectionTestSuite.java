package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.*;

public class CollectionTestSuite {

    private static int i=1;
    @BeforeEach
    public void before() {
        System.out.println(i+"Test Case : Begin");
    }
    @AfterEach
    public void after() {
        System.out.println(i+"Test case : End");
        i++;
    }
    @DisplayName("Creating empty list and object from OddNumbersExterminator class +" +
            "exterminate method should return 0 ")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List <Integer> set1 = new ArrayList<>();

        //When
        OddNumbersExterminator abc = new OddNumbersExterminator();
        List<Integer> set2 = abc.exterminate(set1);
        //Then
        Assertions.assertTrue(set2.isEmpty());
    }

    @DisplayName("Creating list and fiiling it with 1000 numbers, creating object from OddNumbersExterminator class+" +
            "set2_a should return value 500")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> set1_a =  Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        //When
        OddNumbersExterminator abc_1 = new OddNumbersExterminator();
        List<Integer> set2_a = abc_1.exterminate(set1_a);
        Integer expectedValue = 5;
        //Then
        Assertions.assertEquals(expectedValue,set2_a.size());
        Assertions.assertFalse(set2_a.contains(1));

    }
    // DO TEGO WRÓCIC !!!!!!!!!!!!!!!!!!!!!
    List<Integer> extraSet = Arrays.asList();
}
