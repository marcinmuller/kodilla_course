package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.taxiportal.decorator.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */


public class TaxiOrderTestSuite {

    @Test
    public  void  testBasicTaxiOrderGetCost(){
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculatedCost=taxiOrder.getCost();
        //then
        Assert.assertEquals(new BigDecimal(5),calculatedCost);
    }
    @Test
    public void testBasicTaxiOrderGetDescription(){
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //when
        String description=taxiOrder.getDescription();
        //then
        Assert.assertEquals("drive a course", description);
    }
    @Test
    public void testTaxiNetworkGetCost(){
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //when
        BigDecimal calculatedCost=taxiOrder.getCost();
        //then
        Assert.assertEquals(new BigDecimal(40),calculatedCost);
    }
    @Test
    public void testTaxiNetworkGetDescription(){
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //when
        String description=taxiOrder.getDescription();
        //then
        Assert.assertEquals("drive a course"+" by taxi network", description);
    }
    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //when
        BigDecimal calculatedCost=taxiOrder.getCost();
        //then
        Assert.assertEquals(new BigDecimal(37),calculatedCost);
    }
    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //when
        String description = taxiOrder.getDescription();
        //then
        Assert.assertEquals("drive a course" + " by mytaxi network"+" + child seat", description);
    }
}
