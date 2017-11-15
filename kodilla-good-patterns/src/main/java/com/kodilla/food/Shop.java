package com.kodilla.food;


import java.util.List;

public interface Shop {
    public String getName();
    public boolean process();
    public List<Product> getProductList();
}
