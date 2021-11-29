package com.kodilla.exepction.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(10, 23);
        } catch (Exception e) {
            System.out.println("An exception occured: " + e);
        } finally {
            System.out.println("End of the process.");
        }
    }
}