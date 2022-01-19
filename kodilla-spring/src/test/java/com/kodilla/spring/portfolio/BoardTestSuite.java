package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        //When
        toDoList.taskAdd("To do task 1");
        inProgressList.taskAdd("In progress task 2");
        doneList.taskAdd("Done task 3");

        //Then
        assertEquals("To do task 1", toDoList.tasks.get(0));
        assertEquals("In progress task 2", inProgressList.tasks.get(0));
        assertEquals("Done task 3", doneList.tasks.get(0));
    }
}