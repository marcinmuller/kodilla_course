package com.kodilla.food;


import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Shop {
    private String name="GlutenFreeShop";
    private List<Product> productList = new ArrayList<>();
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
