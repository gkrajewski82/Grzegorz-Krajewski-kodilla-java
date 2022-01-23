package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (taskName != null && where != null && using != null) {
            System.out.println("The task is to drive by " + using + where);
        } else {
            System.out.println("Driving data is not complete");
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (taskName != null && where != null && using != null) {
            System.out.println("Driving task is executed");
            return true;
        }
        System.out.println("Driving task is not executed");
        return false;
    }
}