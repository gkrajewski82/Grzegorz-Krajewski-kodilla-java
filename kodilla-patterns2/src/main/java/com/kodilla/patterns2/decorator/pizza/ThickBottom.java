package com.kodilla.patterns2.decorator.pizza;

public class ThickBottom extends AbstractPizzaOrderDecorator {

    public ThickBottom(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + thick bottom";
    }
}