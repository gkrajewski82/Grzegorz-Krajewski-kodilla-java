package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "butter", 1);
            case PAINTING:
                return new PaintingTask("Painting task", "black", "the wall");
            case DRIVING:
                return new DrivingTask("Driving task", "to a friend", "bike");
            default:
                return null;
        }
    }
}