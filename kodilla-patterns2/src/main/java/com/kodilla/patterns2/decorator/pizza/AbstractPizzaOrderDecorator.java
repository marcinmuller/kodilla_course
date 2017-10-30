package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public class AbstractPizzaOrderDecorator implements PizzaOrder {
    private PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
    @Override
    public BigDecimal getCost(){
        return pizzaOrder.getCost();
    }
    @Override
    public String getDescription(){
        return pizzaOrder.getDescription();
    }
}
