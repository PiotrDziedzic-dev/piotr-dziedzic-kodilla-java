package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;


    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("To do","You haven't done this things yet");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readLists = taskListDao.findByListName(name);

        //Then
        Assertions.assertEquals(1,readLists.size());

        //CleanUp
        int id = readLists.get(0).getId();
        taskListDao.deleteById(id);

    }


}
