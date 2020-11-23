package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfDoneTasks {

    public List<Task> doneTasksList = new ArrayList<>();

    public List<Task> getDoneTasksList() {
        return doneTasksList;
    }
}
