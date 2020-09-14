package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        int i=1;
        System.out.println(i+"Test Case : Begin");
        i++;
    }
    @AfterEach
    public void after() {
        int i=1;
        System.out.println(i+"Test case : End");
        i++;
    }
    @DisplayName("Creating empty list and object from OddNumbersExterminator class +" +
            "exterminate method should return 0 ")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List <Integer> set1 = new ArrayList<>();
        set1.clear();
        //When
        OddNumbersExterminator abc = new OddNumbersExterminator();
        List<Integer> set2;
        set2 = abc.exterminate(set1);
        //Then
        Assertions.assertTrue(set2.isEmpty());
    }

    @DisplayName("Creating list and fiiling it with 1000 numbers, creating object from OddNumbersExterminator class+" +
            "set2_a should return value 500")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List <Integer> set1_a = new ArrayList<>();
        for (int i=0; i<999; i++) {
            set1_a.add(i);
        }
        //When
        OddNumbersExterminator abc_1 = new OddNumbersExterminator();
        List<Integer> set2_a;
        set2_a = abc_1.exterminate(set1_a);
        Integer expectedValue = 500;
        //Then
        Assertions.assertEquals(expectedValue,set2_a.size());

    }
}
