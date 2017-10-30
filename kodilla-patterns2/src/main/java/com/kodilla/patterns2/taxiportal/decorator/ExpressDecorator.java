package com.kodilla.patterns2.taxiportal.decorator;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public class ExpressDecorator extends AbstractTaxiOrderDecorator {
    public ExpressDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " express service";
    }
}
