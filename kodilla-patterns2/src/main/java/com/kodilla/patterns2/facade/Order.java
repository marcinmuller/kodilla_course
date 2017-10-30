package com.kodilla.patterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 19.10.17.
 */
public class Order {
    private ProductService productService;
    private List<Item> items = new ArrayList<>();
    private Long orderId;
    private Long userId;
    private boolean isPaid = false;
    private boolean isVerified = false;
    private boolean isSubmitted = false;

    public Order(Long orderId, Long userId, ProductService productService) {
        this.orderId = orderId;
        this.userId = userId;
        this.productService=productService;
    }

    public BigDecimal calculateValue(){
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item: items){
            sum=sum.add(productService.getPrice(item.getProductId())
                    .multiply(new BigDecimal(item.getQty())));
        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setPaid(boolean paid) {

        isPaid = paid;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
