package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class EmailSending implements MessageSendingSystem {
    public void sendMessage(Order order){
        System.out.println("Wysłano email z numerem paczki na adres: "+order.getUser().getContact());
    }
}
