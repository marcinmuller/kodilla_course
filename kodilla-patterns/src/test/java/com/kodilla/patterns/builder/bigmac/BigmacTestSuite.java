package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 22.08.17.
 */
public class BigmacTestSuite {
    @Test
    public void testBigmacRoll(){
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
        //then
        Assert.assertEquals(true,roll);
    }
    @Test
    public void testBigmacCountBurgers(){
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
        int burgers=bigmac.getBurgers();
        //then
        Assert.assertEquals(2,burgers);
    }
    @Test
    public void testBigmacSauce(){
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
        String souce=bigmac.getSauce();
        //then
        Assert.assertEquals("barbecue sauce", souce);
    }
    @Test
    public void testBigmacIngredients(){
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
        int ingredients=bigmac.getIngredients().size();
        //then
        Assert.assertEquals(2,ingredients);
    }
}
