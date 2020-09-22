package com.kodilla.testing.forum.statistics;
import java.util.*;
import java.util.logging.LoggingPermission;

import org.junit.jupiter.api.*;
import org.mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OperationsWithDataTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Nested
    @DisplayName("When amount of Forum user is not 0")
    public class testCase1 {
        @BeforeEach
        void setup() {
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
            Assertions.assertEquals(0, operationsWithData.getAverageAmountOfCommentsPerUser());
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
            Assertions.assertEquals(10, operationsWithData.getAverageAmountOfPostsPerUser());
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
            Assertions.assertEquals(0, operationsWithData.getAverageAmountOfCommentsPerUser());
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
            Assertions.assertTrue(operationsWithData.getAverageAmountOfPostsPerUser() > 332);
            Assertions.assertTrue(operationsWithData.getAverageAmountOfCommentsPerUser() < 334);
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
            Assertions.assertTrue(operationsWithData.getAverageAmountOfPostsPerUser() < 334);
            Assertions.assertTrue(operationsWithData.getAverageAmountOfCommentsPerUser() > 332);

        }

    }


    @Nested
    @DisplayName("When amount of forum users is 0")
    public class testCase2 {

        @Test
        void amountOfForumUsersIs0() {
            //Given
            List<String> abc = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(abc);
            OperationsWithData operationsWithData = new OperationsWithData(statisticsMock);

            //When
            operationsWithData.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(operationsWithData.getAverageAmountOfCommentsPerUser(),0.00000000000009);
            Assertions.assertEquals(operationsWithData.getAverageAmountOfPostsPerUser(),0.00000000000001);


        }
    }
    @Nested
    @DisplayName("When amount of forum users is 100")
    public class testCase3 {
        @Test
        void amountOfUsersIs100() {
            //Given
            List<String> abc = new ArrayList<>();
            for (int i = 0; i<99;i++) {
                abc.add("User"+(i+1));
            }
            int amountOfPosts = 1000;
            when(statisticsMock.postsCount()).thenReturn(amountOfPosts);
            when(statisticsMock.usersNames()).thenReturn(abc);
            OperationsWithData operationsWithData = new OperationsWithData(statisticsMock);

            //When
            operationsWithData.calculateAdvStatistics(statisticsMock);

            //Then
            Assertions.assertEquals(operationsWithData.getAverageAmountOfPostsPerUser(),10);
        }
    }
}

