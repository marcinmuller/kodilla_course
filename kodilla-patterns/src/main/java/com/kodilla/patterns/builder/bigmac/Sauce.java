package com.kodilla.patterns.builder.bigmac;

/**
 * Created by Marcin Muller on 22.08.17.
 */
public class Sauce {
    public final static String BARBECUE="BARBECUE";
    public final static String THOUSAND_ISLANDS="THOUSAND_ISLANDS";
    public final static String STANDARD="STANDARD";
    public static String makeSauce(String sauce){
        switch (sauce){
            case BARBECUE:
                return "barbecue sauce";
            case THOUSAND_ISLANDS:
                return "thousend islands sauce";
            case STANDARD:
                return "standard sauce";
            default:
                throw new IllegalStateException();
        }
    }
}
