package com.kodilla.patterns2.taxiportal.decorator;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 25.10.17.
 */
public interface TaxiOrder {
    BigDecimal getCost();
    String getDescription();
}
