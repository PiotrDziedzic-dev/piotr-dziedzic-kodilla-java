package com.kodilla.testing.forum.statistics;
import java.util.*;
import java.util.logging.LoggingPermission;

import org.junit.jupiter.api.*;
import org.mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OperationsWithDataTestSuite {

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    void XYZ() {
        List<String> abc = new ArrayList<>();
        abc.add("Pawel");
        abc.add("Adam");
        abc.add("Jakub");

        when(statisticsMock.usersNames()).thenReturn(abc);

    }

    @Test
    void amountOfPostsIs0() {
        //Given
        int amountOfPosts = 0;
        when(statisticsMock.postsCount()).thenReturn(amountOfPosts);
        OperationsWithData operationsWithData = new OperationsWithData(statisticsMock);

        //When
        operationsWithData.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0,operationsWithData.getD());
    }
    @Test
    void amountOfPostsIs100() {
        //Given
        int amountOfPosts = 30;
        when(statisticsMock.postsCount()).thenReturn(amountOfPosts);
        OperationsWithData operationsWithData = new OperationsWithData(statisticsMock);

        //When
        operationsWithData.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(10,operationsWithData.getD());
    }
    @Test
    void amountOfCommentsIs0() {
        //Given
        int amountOfComments = 0;
        when(statisticsMock.commentsCount()).thenReturn(amountOfComments);
        OperationsWithData operationsWithData = new OperationsWithData(statisticsMock);

        //When
        operationsWithData.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0,operationsWithData.getD());
    }
    @Test
    void postsAreMoreThenComments() {
        //Given
        int amountOfPosts = 1000;
        int amountOfComments = 999;
        when(statisticsMock.commentsCount()).thenReturn(amountOfComments);
        when(statisticsMock.postsCount()).thenReturn(amountOfPosts);
        OperationsWithData operationsWithData = new OperationsWithData(statisticsMock);

        //When
        operationsWithData.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertTrue(operationsWithData.getD()>operationsWithData.getE());
    }
    @Test
    void amountOfCommentsIsMoreThenPosts() {
        //Given
        int amountOfPosts = 999;
        int amountOfComments = 1000;
        when(statisticsMock.commentsCount()).thenReturn(amountOfComments);
        when(statisticsMock.postsCount()).thenReturn(amountOfPosts);
        OperationsWithData operationsWithData = new OperationsWithData(statisticsMock);

        //When
        operationsWithData.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertTrue(operationsWithData.getE()>operationsWithData.getD());

    }
    @Test
    void amountOfPostsUsersIs0() {
        //Given
        // Jak to zrobic ? Przeciez jak uzytkowników bedzie 0 to bedziemy dzielic przez 0



    }
}
