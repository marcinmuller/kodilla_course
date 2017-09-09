package com.kodilla.food;

/**
 * Created by Marcin Muller on 08.09.17.
 */
public class GlutenFreeShop implements Shop {
    public String name(){
        return "GlutenFreeShop";
    }
    public boolean process(){
        System.out.println("wysłano zamówienie");
        return true;
    }
}
