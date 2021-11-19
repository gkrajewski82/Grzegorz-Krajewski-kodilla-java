package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Beautiful text", (text) -> text + " is now much more beautiful");
        poemBeautifier.beautify("Beautiful text", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Beautiful text", (text) -> text.toLowerCase());
        poemBeautifier.beautify("Beautiful text", (text) -> "8 " + text + " " + text.substring(6).length());
        poemBeautifier.beautify("Beautiful text", (text) -> "CBA - " + text + " - ABC");
        poemBeautifier.beautify("Beautiful text", (text) -> text.replace(' ', '_'));
    }
}
