package com.kodilla.patterns2.taxiportal.decorator;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(5.00);
    }
    @Override
    public String getDescription(){
        return "drive a course";
    }
}
