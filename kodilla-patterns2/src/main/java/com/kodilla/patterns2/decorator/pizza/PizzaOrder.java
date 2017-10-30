package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public interface PizzaOrder {
    BigDecimal getCost();
    String getDescription();
}
