package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class InventoryBalanceOne implements InventoryBalance {
    public void updateInventoryBalance(Order order){
        System.out.println("Zaktualizowano stan magazynowy : "+order.getProduct().getName());
    }
}
