package com.kodilla.food;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class Producer {
    private String name;
    private Map<String, Quantity> products=new HashMap<>();

    public Producer(String name, Map<String, Quantity> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Map<String, Quantity> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producer producer = (Producer) o;

        return name.equals(producer.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
