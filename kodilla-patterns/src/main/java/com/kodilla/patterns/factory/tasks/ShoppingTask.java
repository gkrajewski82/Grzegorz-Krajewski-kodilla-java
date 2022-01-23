package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if (taskName != null && whatToBuy != null && quantity > 0) {
            System.out.println("The task is to buy " + whatToBuy + " in the amount of " + quantity);
        } else {
            System.out.println("Shopping data is not complete");
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (taskName != null && whatToBuy != null && quantity > 0) {
            System.out.println("Shopping task is executed");
            return true;
        }
        System.out.println("Shopping task is not executed");
        return false;
    }
}