package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int addAToB() {
        return a + b;
    }

    public int substractAFromB() {
        return a - b;
    }
}
