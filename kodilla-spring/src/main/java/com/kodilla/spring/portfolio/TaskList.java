package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void taskAdd(String taskName) {
        tasks.add(taskName);
    }

    public List<String> getTasks() {
        return tasks;
    }
}