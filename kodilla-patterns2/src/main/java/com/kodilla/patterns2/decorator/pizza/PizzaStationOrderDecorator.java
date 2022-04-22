package com.kodilla.patterns2.decorator.pizza;

public class PizzaStationOrderDecorator extends AbstractPizzaOrderDecorator{

    public PizzaStationOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from PizzaStation";
    }
}