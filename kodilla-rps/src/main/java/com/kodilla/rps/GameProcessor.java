package com.kodilla.rps;

public class GameProcessor {

    public void playGame(){
        try {
            Game game = new Game();
            game.prepareData();
            while(!game.isEnd()) {
                game.startGame();
                game.givePoint();
                game.checkEnd();
            }
            game.showEndResults();
            game.endOrRestartGame();
        } catch (IncorrectValueException e) {
            System.out.println("Incorrect value exception. The game will exit.");
        }
    }
}