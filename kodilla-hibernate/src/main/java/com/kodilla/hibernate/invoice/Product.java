package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 06.09.17.
 */

@Entity
@Table(name="PRODUCTS")
public class Product {
    private int id;
    private String name;
    private List<Item> items=new ArrayList<>();

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {

        return items;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setId(int id) {

        this.id = id;
    }

    @NotNull
    public String getName() {

        return name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    public int getId() {

        return id;
    }

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }
}
