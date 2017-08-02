package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Muller on 30.07.17.
 */
public final class World {
    private final Set<Continent> world=new HashSet<>();

    public World(final Continent...continent){
        for(Continent c: continent){
            world.add(c);
        }
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal result=world.stream()
                .flatMap(s->s.getContinent().stream())
                .map(s->s.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(s,c)->s=s.add(c));
        System.out.println(result);
        return result;
    }
}
