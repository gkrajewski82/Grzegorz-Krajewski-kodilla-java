package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    void testAddTask() {
        //Given
        Student john = new Student("John");
        Student mark = new Student("Mark");
        Student ana = new Student("Ana");
        Task johnTaskA = new Task(john, "Task Aj", "Content Aj");
        Task johnTaskB = new Task(john, "Task Bj", "Content Bj");
        Task johnTaskC = new Task(john, "Task Cj", "Content Cj");
        Task markTaskA = new Task(mark, "Task Am", "Content Am");
        Task markTaskB = new Task(mark, "Task Bm", "Content Bm");
        Task markTaskC = new Task(mark, "Task Cm", "Content Cm");
        Task markTaskD = new Task(mark, "Task Dm", "Content Dm");
        Task anaTaskA = new Task(ana, "Task Aa", "Content Aa");
        Task anaTaskB = new Task(ana, "Task Ba", "Content Ba");
        Task anaTaskC = new Task(ana, "Task Ca", "Content Ca");
        TaskQueue johnTasks = new TaskQueue("John's tasks queue");
        TaskQueue markTasks = new TaskQueue("Mark's tasks queue");
        TaskQueue anaTasks = new TaskQueue("Ana's tasks queue");

        Mentor mentor1 = new Mentor("Tom");
        Mentor mentor2 = new Mentor("Lucas");
        johnTasks.registerObserver(mentor1);
        markTasks.registerObserver(mentor2);
        anaTasks.registerObserver(mentor1);

        //When
        johnTasks.addTask(johnTaskA);
        johnTasks.addTask(johnTaskB);
        johnTasks.addTask(johnTaskC);

        markTasks.addTask(markTaskA);
        markTasks.addTask(markTaskB);
        markTasks.addTask(markTaskC);
        markTasks.addTask(markTaskD);

        anaTasks.addTask(anaTaskA);
        anaTasks.addTask(anaTaskB);
        anaTasks.addTask(anaTaskC);

        //Then
        assertEquals(6, mentor1.getUpdateCount());
        assertEquals(4, mentor2.getUpdateCount());
    }
}