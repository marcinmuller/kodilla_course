package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public class OlivesPizzaDecorator extends AbstractPizzaOrderDecorator{
    public OlivesPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getDescription(){
        return super.getDescription()+" + olives";
    }
}
