package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 22.08.17.
 */
public final class Bigmac {
    private final boolean roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder{
        private boolean roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients=new ArrayList<>();

        public BigmacBuilder roll(boolean roll){
            this.roll=roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            this.burgers=burgers;
            return this;
        }

        public BigmacBuilder sauce (String sauce){
            this.sauce=Sauce.makeSauce(sauce);
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            ingredients.add(Ingredient.makeIngedient(ingredient));
            return this;
        }

        public Bigmac build(){
            return new Bigmac(roll, burgers,sauce, ingredients);
        }
    }

    private Bigmac(boolean roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    @Override
    public String toString(){
        String sesame,additionalIngredients="";
        if(roll) sesame="roll with sesame seeds"; else sesame="plain roll";
        for(String i: ingredients) additionalIngredients=i+", "+additionalIngredients;
        return "Bigmac: "+sesame+", "+burgers+" burgers, "+sauce+", "+additionalIngredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getSauce() {

        return sauce;
    }

    public int getBurgers() {

        return burgers;
    }

    public boolean isRoll() {

        return roll;
    }
}
