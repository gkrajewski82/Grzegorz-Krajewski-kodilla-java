package com.kodilla.patterns2.decorator.pizza;

public class NinjaPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    public NinjaPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from NinjaPizza";
    }
}