package com.kodilla.food;


public class Processor {
    public void showProducts(Shop shop){
        System.out.println(shop.getName());
        for (Product p: shop.getProductList()){
            System.out.println(p.getName()+" "+p.getPrice());
        }
    }
}
