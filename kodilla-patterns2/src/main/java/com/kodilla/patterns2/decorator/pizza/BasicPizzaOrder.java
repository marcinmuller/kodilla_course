package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(15);
    }
    @Override
    public String getDescription(){
        return "crust, sauce, cheese";
    }
}
