package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 22.08.17.
 */
public class BigmacTestSuite {
    @Test
    public void testBigmac(){
        //given
        Bigmac bigmac=new Bigmac.BigmacBuilder()
                .roll(true)
                .burgers(2)
                .sauce(Sauce.BARBECUE)
                .ingredient(Ingredient.BECON)
                .ingredient(Ingredient.ONION)
                .build();
        System.out.println(bigmac);
        //when
        boolean roll=bigmac.isRoll();
        int burgers=bigmac.getBurgers();
        String souce=bigmac.getSauce();
        int ingredients=bigmac.getIngredients().size();
        //then
        Assert.assertEquals(true,roll);
        Assert.assertEquals(2,burgers);
        Assert.assertEquals("barbecue sauce", souce);
        Assert.assertEquals(2,ingredients);
    }
}
