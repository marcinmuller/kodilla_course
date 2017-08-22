package com.kodilla.patterns.builder.bigmac;

/**
 * Created by Marcin Muller on 22.08.17.
 */
public class Ingredient {
    public final static String LETTUCE="LETTUCE";
    public final static String ONION="ONION";
    public final static String BECON="BECON";
    public static String makeIngedient(String sauce){
        switch (sauce){
            case LETTUCE:
                return "lettuce";
            case ONION:
                return "onion";
            case BECON:
                return "becon";
            default:
                throw new IllegalStateException();
        }
    }
}
