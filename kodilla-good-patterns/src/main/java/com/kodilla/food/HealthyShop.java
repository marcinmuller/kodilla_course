package com.kodilla.food;

/**
 * Created by Marcin Muller on 08.09.17.
 */
public class HealthyShop implements Shop {
    public String name(){
        return "HealthyShop";
    }
    public boolean process(){
        System.out.println("wysłano zamówienie");
        return true;
    }
}
