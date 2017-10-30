package com.kodilla.patterns2.facade.api;

/**
 * Created by Marcin Muller on 19.10.17.
 */
public final class ItemDto {
    private final Long productId;
    private final double quantity;

    public ItemDto(final Long productId, final double quantity){
        this.productId=productId;
        this.quantity=quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }
}
