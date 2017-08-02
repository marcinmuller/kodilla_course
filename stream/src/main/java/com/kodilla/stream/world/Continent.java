package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Muller on 30.07.17.
 */
public final class Continent {
    private final Set<Country> continent=new HashSet<Country>();

    public Continent(final Country...country) {
        for(Country c: country){
            continent.add(c);
        }
    }

    public Set<Country> getContinent() {
        return continent;
    }

}
