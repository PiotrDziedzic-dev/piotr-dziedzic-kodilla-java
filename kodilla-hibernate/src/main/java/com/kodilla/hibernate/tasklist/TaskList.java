package com.kodilla.hibernate.tasklist;

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

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "listname")
    public void setListName(String listName) {
        this.listName = listName;
    }

    @Column(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getListName() {
        return listName;
    }

    public String getDescription() {
        return description;
    }
}
