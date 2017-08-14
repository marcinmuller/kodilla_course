package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

/**
 * Created by Marcin Muller on 12.08.17.
 */
@Component
public class Display {
    public void displayValue(double val){
        System.out.println(val);
    }
}
