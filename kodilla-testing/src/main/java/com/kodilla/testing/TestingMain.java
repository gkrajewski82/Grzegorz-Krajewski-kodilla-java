package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(34, 76);
        int resultSubstractBFromA = calculator.substractBFromA(34, 54);

        if (resultAdd == 110) {
            System.out.println("test OK");
        } else {
            System.out.println("ERROR!");
        }

        if (resultSubstractBFromA == -20) {
            System.out.println("test OK");
        } else {
            System.out.println("ERROR!");
        }
    }
}
