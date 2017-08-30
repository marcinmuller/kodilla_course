package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class ProductOrderService {
    public static void main(String[] args){
        OrderRetriever orderRetriever=new OrderRetriever();
        Order order=orderRetriever.retrieve();

        OrderProcessor orderProcessor=new OrderProcessor(new EmailSending(), new SendByPost(), new InventoryBalanceImpl());
        if (orderProcessor.process(order)) {
            System.out.println(" zamówienie zrealizowane");
        } else {
            System.out.println(" zamówienie niezrealizowane");
        }

/*
        System.out.println("------------------------------");
        Order order2=orderRetriever.retrieve();
        orderProcessor.process(order2);
        System.out.println("------------------------------");
        Order order3=orderRetriever.retrieve();
        orderProcessor.process(order3);
        System.out.println("------------------------------");
        Order order4=orderRetriever.retrieve();
        orderProcessor.process(order4);
        System.out.println("------------------------------");
        Order order5=orderRetriever.retrieve();
        orderProcessor.process(order5);

        */
    }
}
