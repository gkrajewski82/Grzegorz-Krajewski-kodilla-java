package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        // class SimpleUser test //
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // class Calculator test //
        Calculator calculator = new Calculator(48, 32);

        int addResult = calculator.addAToB();
        int substractResult = calculator.substractAFromB();
        int calculatorA = calculator.getA();
        int calculatorB = calculator.getB();

        if (calculatorA == 48) {
            System.out.println("test calculator_1 OK");
        } else {
            System.out.println("calculator_1 Error!");
        }

        if (calculatorB == 32) {
            System.out.println("test calculator_2 OK");
        } else {
            System.out.println("calculator_2 Error!");
        }

        if (addResult == calculator.getA() + calculator.getB()) {
            System.out.println("Test calculator_3 OK");
        } else {
            System.out.println("calculator_3 Error!");
        }

        if (substractResult == calculator.getA() - calculator.getB()) {
            System.out.println("Test calculator_4 OK");
        } else {
            System.out.println("calculator_4 Error!");
        }
    }
}
