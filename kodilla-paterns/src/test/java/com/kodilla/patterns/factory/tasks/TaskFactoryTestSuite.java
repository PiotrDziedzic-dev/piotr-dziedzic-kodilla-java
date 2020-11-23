package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(taskFactory.DRIVINGTASK);
        drivingTask.executeTask();

        //Then
        Assertions.assertEquals(drivingTask.getTaskName(),"DrivingTask");
        Assertions.assertTrue(drivingTask.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(taskFactory.PAINTINGTASK);
        paintingTask.executeTask();

        //Then
        Assertions.assertEquals(paintingTask.getTaskName(),"PaintingTask");
        Assertions.assertTrue(paintingTask.isTaskExecuted());
    }
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(taskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();

        //Then
        Assertions.assertEquals(shoppingTask.getTaskName(),"ShoppingTask");
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
    }
}
