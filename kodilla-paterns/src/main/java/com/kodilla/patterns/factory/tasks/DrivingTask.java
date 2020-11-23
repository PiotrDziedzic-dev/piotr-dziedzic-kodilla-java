package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;

    CollectionOfDoneTasks collectionOfDoneTasks = new CollectionOfDoneTasks();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public void executeTask() {
        collectionOfDoneTasks.getDoneTasksList().add(this);
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public Boolean isTaskExecuted() {

        if(collectionOfDoneTasks.getDoneTasksList().contains(this)) {
            return true;
        } else {
            return false;
        }
    }
}
