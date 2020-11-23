package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    CollectionOfDoneTasks collectionOfDoneTasks = new CollectionOfDoneTasks();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
