package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class OrderProcessor {
    private MessageSendingSystem messageSendingSystem;
    private ProductSendingSystem productSendingSystem;
    private InventoryBalance inventoryBalance;

    public OrderProcessor(MessageSendingSystem messageSendingSystem, ProductSendingSystem productSendingSystem, InventoryBalance inventoryBalance) {
        this.messageSendingSystem = messageSendingSystem;
        this.productSendingSystem = productSendingSystem;
        this.inventoryBalance = inventoryBalance;
    }

    public void process(Order order){
        if(order.getProduct().getAvailability()) {
            productSendingSystem.send(order);
            inventoryBalance.updateInventoryBalance(order);
            messageSendingSystem.sendMessage(order);
        }else{
            System.out.println(order.getProduct().getName()+" - brak w magazynie");
        }
    }
}
