package com.kodilla.stream.world;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 30.07.17.
 */
public final class Country {
    private final String name;
    private final BigDecimal population;

    public Country(final String name, final BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity(){
        return population;
    }
}
