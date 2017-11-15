package com.kodilla.food;


import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Shop {
    private String name="ExtraFoodShop";
    private List<Product> productList = new ArrayList<>();

    public boolean process(){
        System.out.println("wysłano zamówienie");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public List<Product> getProductList() {
        return productList;
    }
}
