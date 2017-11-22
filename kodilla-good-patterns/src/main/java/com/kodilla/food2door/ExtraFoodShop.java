package com.kodilla.food2door;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 22.11.17.
 */

@Getter
public class ExtraFoodShop implements Shop {
    private String NAME = "ExtraFoodShop";
    private List<Product> products = new ArrayList<>();
    private List<Product> wishList = new ArrayList<>();

    @Override
    public void offer(){
        System.out.println(NAME);
        for (Product p: products){
            System.out.println(p.getName()+" "+p.getPrice()+"zł");
        }
    }

    @Override
    public boolean process(Order order) {
        boolean result=true;
        for(Order.Item i: order.getItems()){
            if(!products.contains(i.getProduct())){
                System.out.println("lack of "+i.getProduct().getName()+" availability");
                wishList.add(i.getProduct());
                result=false;
            } else{
                System.out.println(i.getQuantity()+"x "+i.getProduct().getName()+" "+i.getTotalPrice()+"zł");
            }
        }
        return result;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
