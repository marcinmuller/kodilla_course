package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Marcin Muller on 13.08.17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculationsAdd() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator=context.getBean(Calculator.class);
        //when
        double result=calculator.add(1,2);
        //then
        Assert.assertEquals(3,result,0);
    }
    @Test
    public void testCalculationsDiv() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator=context.getBean(Calculator.class);
        //when
        double result=calculator.div(4,2);
        //then
        Assert.assertEquals(2,result,0);
    }
    @Test
    public void testCalculationsSub() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator=context.getBean(Calculator.class);
        //when
        double result=calculator.sub(4,2);
        //then
        Assert.assertEquals(2,result,0);
    }
    @Test
    public void testCalculationsMul() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator=context.getBean(Calculator.class);
        //when
        double result=calculator.mul(4,2);
        //then
        Assert.assertEquals(8,result,0);
    }
}
