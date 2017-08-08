package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class SendByPost implements ProductSendingSystem {
    public void send(Order order){
        System.out.println("Wysłano pocztą: "+order.getProduct().getName()+" na adres: "+order.getUser().getName()+", "+order.getUser().getAddress());
    }
}
