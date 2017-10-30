package com.kodilla.patterns2.aop.calculator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 26.10.17.
 */
@Component
public class Calculator {
    public double add(double x, double y){
        return x+y;
    }
    public double sub(double x, double y){
        return x-y;
    }
    public double mul(double x, double y){
        return x*y;
    }
    public double div(double x, double y){
        if(y==0){
            throw new  ArithmeticException("divide by 0");
        }else{
            return x/y;
        }
    }
    public BigDecimal factorial(BigDecimal n){
        if(n.compareTo(BigDecimal.ONE)>0){
            return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
        }else if(n.equals(BigDecimal.ZERO) || n.equals(BigDecimal.ONE)){
            return BigDecimal.ONE;
        }else {
            throw new ArithmeticException("factorial argument is negative");
        }
    }
}
