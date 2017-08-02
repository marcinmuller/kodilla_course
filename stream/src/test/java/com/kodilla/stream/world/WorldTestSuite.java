package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 30.07.17.
 */
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world=new World(new Continent(new Country("burma", new BigDecimal(50000000)), new Country("iran", new BigDecimal(80000000))),
                new Continent(new Country("germany", new BigDecimal(80000000)), new Country("denmark", new BigDecimal(6000000))));
        //When
        BigDecimal population = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("216000000"),population);
    }
}
