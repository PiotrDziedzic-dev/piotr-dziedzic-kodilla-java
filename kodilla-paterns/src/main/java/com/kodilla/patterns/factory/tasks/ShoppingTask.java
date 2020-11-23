package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    CollectionOfDoneTasks collectionOfDoneTasks = new CollectionOfDoneTasks();

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
