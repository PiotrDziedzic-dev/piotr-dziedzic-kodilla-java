package com.kodilla.hibernate.task.dao;


import com.kodilla.hibernate.task.TaskList2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository

public interface TaskListDao2 extends CrudRepository <TaskList2, Integer> {

}
