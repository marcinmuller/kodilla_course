package com.kodilla.food2door;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcin Muller on 22.11.17.
 */

@Getter
public class HealthyShop implements Shop{
    private String NAME = "ExtraFoodShop";
    private Map<Product,Integer> products = new HashMap<>();

    @Override
    public void offer(){
        System.out.println(NAME);
        for (Map.Entry<Product, Integer> p: products.entrySet()){
            System.out.println(p.getKey().getName()+" "+p.getKey().getPrice()+"zł");
        }
    }

    @Override
    public boolean process(Order order) {
        boolean result=true;
        for(Order.Item i: order.getItems()){
            if( products.get(i.getProduct())<i.getQuantity() || !products.containsKey(i.getProduct())){
                System.out.println("lack of "+i.getProduct().getName()+" availability");
                result=false;
            } else{
                System.out.println(i.getQuantity()+"x "+i.getProduct().getName()+" "+i.getTotalPrice()+"zł");
            }
        }
        return result;
    }

    public void addProduct(Product product, Integer quantity) {
        products.put(product, quantity);
    }
}
