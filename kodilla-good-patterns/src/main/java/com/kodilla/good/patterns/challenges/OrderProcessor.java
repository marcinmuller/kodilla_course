package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class OrderProcessor {
    private MessageSendingSystem messageSendingSystem;
    private ProductSendingSystem productSendingSystem;
    private InventoryBalanceService inventoryBalanceService;

    public OrderProcessor(MessageSendingSystem messageSendingSystem, ProductSendingSystem productSendingSystem, InventoryBalanceService inventoryBalanceService) {
        this.messageSendingSystem = messageSendingSystem;
        this.productSendingSystem = productSendingSystem;
        this.inventoryBalanceService = inventoryBalanceService;
    }

    public boolean process(Order order){
        if(order.getProduct().isAvailable()) {
            productSendingSystem.send(order);
            inventoryBalanceService.updateInventoryBalance(order);
            messageSendingSystem.sendMessage(order);
            return true;
        }else{
            System.out.println(order.getProduct().getName()+" - brak w magazynie");
            return false;
        }
    }
}
