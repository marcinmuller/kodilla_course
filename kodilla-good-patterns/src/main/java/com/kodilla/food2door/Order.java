package com.kodilla.food2door;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 22.11.17.
 */

@Getter
public class Order {

    @Getter
    public class Item {
        private Product product;
        private int quantity;
        private double totalPrice;

        private Item(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
            totalPrice = quantity * product.getPrice();
        }
    }

    private List<Item> items=new ArrayList<>();
    private Client client;

    public Order(Client client) {
        this.client = client;
    }

    public void toOrder(Product product, int quantity){
        Item item=new Item(product, quantity);
        items.add(item);
    }
}