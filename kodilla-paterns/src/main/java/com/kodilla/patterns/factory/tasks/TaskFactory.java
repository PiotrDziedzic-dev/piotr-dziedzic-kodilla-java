package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DrivingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String SHOPPINGTASK = "ShoppingTask";

    public final Task makeTask(final String taskClass) {

        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("DrivingTask","To London","Plane");
            case PAINTINGTASK:
                return new PaintingTask("PaintingTask","Blue","Portrait");
            case SHOPPINGTASK:
                return new ShoppingTask("ShoppingTask","Tomatoes",3.5);
            default:
                return null;
        }

    }
}
