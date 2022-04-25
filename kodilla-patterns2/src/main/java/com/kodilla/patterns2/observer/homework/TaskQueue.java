package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskQueue implements Observable {

    private Observer observer;
    private final String queueName;
    private final Deque<Task> tasks;

    public TaskQueue(String queueName) {
        this.tasks = new ArrayDeque<>();
        this.queueName = queueName;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver() {
        observer.updateQueue(this);
    }

    public Deque<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.offer(task);
        notifyObserver();
    }

    public String getQueueName() {
        return queueName;
    }
}