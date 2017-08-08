package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class ProductOrderService {
    public static void main(String[] args){
        OrderRetriever orderRetriever=new OrderRetriever();
        Order order=orderRetriever.retrieve();

        OrderProcessor orderProcessor=new OrderProcessor(new EmailSending(), new SendByPost(), new InventoryBalanceOne());
        orderProcessor.process(order);


    }
}
