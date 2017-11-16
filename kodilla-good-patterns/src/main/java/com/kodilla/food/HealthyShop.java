package com.kodilla.food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 08.09.17.
 */
public class HealthyShop implements Shop {
    private String name="HealthyShop";
    private List<Product> productList = new ArrayList<>();
//    private List<Item> itemList = new ArrayList<>();

    @Override
    public List<Product> getProductList() {
        return productList;
    }

    public boolean process(){
        System.out.println("wysłano zamówienie");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
