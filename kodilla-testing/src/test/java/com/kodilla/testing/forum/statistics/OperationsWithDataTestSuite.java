package com.kodilla.testing.forum.statistics;
import java.util.*;
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

}
