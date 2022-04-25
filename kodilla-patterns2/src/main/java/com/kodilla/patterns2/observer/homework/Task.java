package com.kodilla.patterns2.observer.homework;

public class Task {

    Student student;
    String taskName;
    String taskContent;

    public Task(Student student, String taskName, String taskContent) {
        this.student = student;
        this.taskName = taskName;
        this.taskContent = taskContent;
    }

    public Student getStudent() {
        return student;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskContent() {
        return taskContent;
    }
}
