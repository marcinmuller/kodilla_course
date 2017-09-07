package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 06.09.17.
 */
@Table(name="INVOICES")
@Entity
public class Invoice {
    private int id;
    private String number;
    private List<Item> items=new ArrayList<>();

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public void setId(int id) {

        this.id = id;
    }

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            targetEntity = Item.class,
            mappedBy = "invoice"
    )
    public List<Item> getItems() {

        return items;
    }

    public String getNumber() {

        return number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    public int getId() {

        return id;
    }
}
