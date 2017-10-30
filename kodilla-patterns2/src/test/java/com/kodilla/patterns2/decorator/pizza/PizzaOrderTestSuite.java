package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public class PizzaOrderTestSuite {
    @Test
    public void AllToppingsPizzaGetCost(){
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AnchoviesPizzaDecorator(pizzaOrder);
        pizzaOrder = new CapersPizzaDecorator(pizzaOrder);
        pizzaOrder = new OlivesPizzaDecorator(pizzaOrder);
        //when
        BigDecimal cost = pizzaOrder.getCost();
        //then
        Assert.assertEquals(new BigDecimal(28),cost);
    }
    @Test
    public void AllToppingsPizzaGetDescription(){
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AnchoviesPizzaDecorator(pizzaOrder);
        pizzaOrder = new CapersPizzaDecorator(pizzaOrder);
        pizzaOrder = new OlivesPizzaDecorator(pizzaOrder);
        //when
        String description = pizzaOrder.getDescription();
        //then
        Assert.assertEquals("crust, sauce, cheese + anchovies + capers + olives", description);
    }
}
