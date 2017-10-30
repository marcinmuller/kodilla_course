package com.kodilla.patterns2.facade;

/**
 * Created by Marcin Muller on 19.10.17.
 */
public class Item {
    private final Long productId;
    private final double qty;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public double getQty() {
        return qty;
    }

    public Long getProductId() {

        return productId;
    }
}
