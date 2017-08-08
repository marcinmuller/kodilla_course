package com.kodilla.food;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class Order {
    private String product;
    private Quantity quantity;
    private User user;

    public Order(String product, Quantity quantity, User user) {
        this.product = product;
        this.quantity = quantity;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Quantity getQuantity() {

        return quantity;
    }

    public String getProduct() {

        return product;
    }
}
