package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "TASKSLISTS")

public class TaskList {

    private int id;
    private String listName;
    private String description;


    public TaskList(String listName, String description) {

        this.listName = listName;
        this.description = description;
    }
    public TaskList(){

    }

    public void setId(int id) {
        this.id = id;
    }
    public void setListName(String listName) {
        this.listName = listName;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "listname")
    public String getListName() {
        return listName;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }
}
