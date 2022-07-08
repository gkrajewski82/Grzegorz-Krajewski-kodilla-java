package com.kodilla.rps;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
public class Game {

    private static final String GAME_KEYBOARD = "1 - ROCK, 2 - PAPER, 3 - SCISSORS";
    private static final String ENDING_KEYBOARD = "x - END GAME, n - NEW GAME";
    private static final String INCORRECT_VALUE = "Incorrect value - You should press: ";
    private static final String POINT = "1 point goes to ";
    private static final String SCORE = "Total score is: ";

    Scanner keyboard = new Scanner(System.in);
    Player computer = new Player("Computer", 0, null);
    Player human = new Player(null, 0, null);
    int roundsToWin;
    boolean end = false;
    Random randomGenerator = new Random();
    int tryCounter = 1;

    public void prepareData() throws IncorrectValueException {
        System.out.println("Please type Your name");
        String playerName = keyboard.nextLine();
        human.setName(playerName);
        System.out.println("Please type the number of rounds needed to win the game");
        try {
            int rounds = keyboard.nextInt();
            setRoundsToWin(rounds);
        } catch (InputMismatchException e) {
            throw new IncorrectValueException();
        }
        System.out.println("Keyboard: " + GAME_KEYBOARD + ", " + ENDING_KEYBOARD + "\n<<<THE GAME STARTED>>>");
    }

    public void startGame() throws IncorrectValueException {
        try {
            System.out.println("Your turn " + human.getName());
            int humanFigureNumber = keyboard.nextInt();
            Figure humanFigure = new Figure(humanFigureNumber);
            human.setChosenFigure(humanFigure);
            if (humanFigureNumber <= 3 & humanFigureNumber >= 1) {
                System.out.println(computer.getName() + "'s choice:");
                int computerFigureNumber = randomGenerator.nextInt(3) + 1;
                Figure computerFigure = new Figure(computerFigureNumber);
                computer.setChosenFigure(computerFigure);

                System.out.println(computerFigure.getFigureNumber());
                System.out.println(human.getName() + " has chosen: " + humanFigure.getFigure(humanFigureNumber) + "  ||  "
                        + computer.getName() + " has chosen: " + computerFigure.getFigure(computerFigureNumber));
            } else {
                System.out.println(INCORRECT_VALUE + GAME_KEYBOARD);
                startGame();
            }
        } catch (InputMismatchException e) {
            throw new IncorrectValueException();
        }
    }

    public void givePoint() {
        int n1 = computer.getPoints();
        int n2 = human.getPoints();
        int computerFigureNumber = computer.getChosenFigure().getFigureNumber();
        int humanFigureNumber = human.getChosenFigure().getFigureNumber();
        if(computerFigureNumber == 1 && humanFigureNumber == 2) {
            human.setPoints(n2 += 1);
            System.out.println(POINT + human.getName());
            System.out.println(SCORE + human.getName() + ": " + human.getPoints() + ", "
                    + computer.getName() + ": " + computer.getPoints() + "\n");
        } else if (computerFigureNumber == 1 && humanFigureNumber == 3) {
            computer.setPoints(n1 += 1);
            System.out.println(POINT + computer.getName());
            System.out.println(SCORE + human.getName() + ": " + human.getPoints() + ", "
                    + computer.getName() + ": " + computer.getPoints() + "\n");
        } else if(computerFigureNumber == 2 && humanFigureNumber == 3) {
            human.setPoints(n2 += 1);
            System.out.println(POINT + human.getName());
            System.out.println(SCORE + human.getName() + ": " + human.getPoints() + ", "
                    + computer.getName() + ": " + computer.getPoints() + "\n");
        } else if(computerFigureNumber == 2 && humanFigureNumber == 1) {
            computer.setPoints(n1 += 1);
            System.out.println(POINT + computer.getName());
            System.out.println(SCORE + human.getName() + ": " + human.getPoints() + ", "
                    + computer.getName() + ": " + computer.getPoints() + "\n");
        } else if(computerFigureNumber == 3 && humanFigureNumber == 2) {
            computer.setPoints(n1 += 1);
            System.out.println(POINT + computer.getName());
            System.out.println(SCORE + human.getName() + ": " + human.getPoints() + ", "
                    + computer.getName() + ": " + computer.getPoints() + "\n");
        } else if(computerFigureNumber == 3 && humanFigureNumber == 1) {
            human.setPoints(n2 += 1);
            System.out.println(POINT + human.getName());
            System.out.println(SCORE + human.getName() + ": " + human.getPoints() + ", "
                    + computer.getName() + ": " + computer.getPoints() + "\n");
        } else {
            System.out.println("No winner!");
            System.out.println(SCORE + human.getName() + ": " + human.getPoints() + ", "
                    + computer.getName() + ": " + computer.getPoints() + "\n");
        }
    }

    public String checkWinner() {
        if (computer.getPoints() > human.getPoints()) {
            return computer.getName();
        } return human.getName();
    }

    public void checkEnd() {
        if (human.getPoints() < roundsToWin & computer.getPoints() < roundsToWin) {
            tryCounter++;
        } else setEnd(true);
    }

    public void showEndResults() {
        System.out.println("<<<THE GAME IS OVER>>>\nThe winner is: " + checkWinner());
        System.out.println("Keyboard: " + ENDING_KEYBOARD);
    }

    public void endOrRestartGame() throws IncorrectValueException {
        Scanner keyboard = new Scanner(System.in);
        String endOrRestartGame = keyboard.nextLine();
        if (endOrRestartGame.equals("n")) {
            restartGame();
        } else if (endOrRestartGame.equals("x")) {
            endGame();
        } else {
            System.out.println(INCORRECT_VALUE + ENDING_KEYBOARD);
            endOrRestartGame();
        }
    }

    public void restartGame() throws IncorrectValueException {
        System.out.println("Do you really want to start a new game? Confirm by pressing \"n\"");
        Scanner keyboard = new Scanner(System.in);
        String restartGame = keyboard.nextLine();
        if (restartGame.equals("n")) {
            GameProcessor gameProcessor = new GameProcessor();
            gameProcessor.playGame();
        } else {
            System.out.println(INCORRECT_VALUE + ENDING_KEYBOARD);
            endOrRestartGame();
        }
    }

    public void endGame() throws IncorrectValueException {
        System.out.println("Do you really want to exit the game? Confirm by pressing \"x\"");
        Scanner keyboard = new Scanner(System.in);
        String endGame = keyboard.nextLine();
        if (endGame.equals("x")) {
            System.out.println("The GAME is over!");
        } else {
            System.out.println(INCORRECT_VALUE + ENDING_KEYBOARD);
            endOrRestartGame();
        }
    }
}