package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class Product {
    private String name;
    private boolean availability;

    public Product(String name,Storage storage) {
        this.name = name;
//        Storage storage=new StorageOne();
        availability=storage.checkAvailability(name);
    }

    public String getName() {
        return name;
    }

    public boolean getAvailability() {
        return availability;
    }
}
