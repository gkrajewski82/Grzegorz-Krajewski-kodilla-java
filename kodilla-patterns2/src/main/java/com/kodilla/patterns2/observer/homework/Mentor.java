package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateQueue(TaskQueue taskQueue) {
        System.out.println(taskQueue.getQueueName() + " has been updated.");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}