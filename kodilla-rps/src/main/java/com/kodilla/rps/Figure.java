package com.kodilla.rps;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Figure {

    private int figureNumber;

    public String getFigure(int figureNumber) {
        if (figureNumber == 1) {
            return "ROCK";
        } else if (figureNumber == 2) {
            return "PAPER";
        } return "SCISSORS";
    }
}