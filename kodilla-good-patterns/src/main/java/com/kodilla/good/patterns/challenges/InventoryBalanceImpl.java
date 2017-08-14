package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class InventoryBalanceImpl implements InventoryBalanceService {
    public void updateInventoryBalance(Order order){
        order.getProduct().getStorage().inventoryBalanceRefreshment();
        System.out.println("Zaktualizowano stan magazynowy : "+order.getProduct().getName());
    }
}
