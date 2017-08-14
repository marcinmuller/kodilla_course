package com.kodilla.good.patterns.challenges;

/**
 * Created by Marcin Muller on 07.08.17.
 */
public class Product {
    private String name;
    private boolean availability;
    private Storage storage;

    public Product(String name,Storage storage) {
        this.name = name;
        this.storage=storage;
        availability=storage.checkAvailability(name);
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return availability;
    }

    public Storage getStorage() {
        return storage;
    }
}
