package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue taskQueue1 = new TaskQueue("Kursant ABC Lista");
        TaskQueue taskQueue2 = new TaskQueue("Kursant DEF Lista");
        TaskQueue taskQueue3 = new TaskQueue("Kursant XYZ Lista");
        TaskQueue taskQueue4 = new TaskQueue("Kursant PQR Lista");
        Mentor mentor1 = new Mentor("Jan","Kowalski");
        Mentor mentor2 = new Mentor("Piotr","Nowak");
        taskQueue1.registerObserver(mentor1);
        taskQueue2.registerObserver(mentor1);
        taskQueue3.registerObserver(mentor2);
        taskQueue4.registerObserver(mentor2);

        //When
        taskQueue1.addTask("Task1");
        taskQueue2.addTask("Task2");
        taskQueue3.addTask("Task3");
        taskQueue4.addTask("Task4");

        //Then
        Assertions.assertEquals(2,mentor1.getUpdateCount());
        Assertions.assertEquals(2,mentor2.getUpdateCount());
    }
}
