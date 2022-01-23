package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (taskName != null && color != null && whatToPaint != null) {
            System.out.println("The task is to paint " + whatToPaint + " with " + color + " paint");
        } else {
            System.out.println("Painting data is not complete");
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (taskName != null && color != null && whatToPaint != null) {
            System.out.println("Painting task is executed");
            return true;
        }
        System.out.println("Painting task is not executed");
        return false;
    }
}