package com.kodilla.spring.portfolio;


import com.kodilla.spring.library.LibraryConfig;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd(){
        //Given
        //When
        board.getDoneList().getTasks().add("Task 1 is done");
        board.getInProgressList().getTasks().add("Task 2 is in progress");
        board.getToDoList().getTasks().add("You are going to do task 3");

        //Then
        Assertions.assertEquals(board.getDoneList().getTasks().get(0),"Task 1 is done");
        Assertions.assertEquals(board.getInProgressList().getTasks().get(0),"Task 2 is in progress");
        Assertions.assertEquals(board.getToDoList().getTasks().get(0),"You are going to do task 3");


    }
}
