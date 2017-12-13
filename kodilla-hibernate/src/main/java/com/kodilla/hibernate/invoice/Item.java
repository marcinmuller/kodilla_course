package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by Marcin Muller on 06.09.17.
 */
@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="INVOICE_ID")
    public Invoice getInvoice() {

        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    public int getId() {

        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL)   //?????????/
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        value=price.multiply(new BigDecimal(quantity));
    }

    public Item() {
    }
}
