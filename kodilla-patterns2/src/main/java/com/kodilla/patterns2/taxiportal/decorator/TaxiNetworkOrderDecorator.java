package com.kodilla.patterns2.taxiportal.decorator;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public class TaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator{
    public TaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(35));
    }
    @Override
    public String getDescription(){
        return super.getDescription()+" by taxi network";
    }
}
