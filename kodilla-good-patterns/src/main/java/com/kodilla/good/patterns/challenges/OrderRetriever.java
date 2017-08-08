package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class OrderRetriever {

    public Order retrieve(){
        User user=new User("Józef K.","pensjonat pani Grubach", "józio@k.cz");
        Product product=new Product("krzyżówki", new StorageOne());
        return new Order(user, product);
    }
}
