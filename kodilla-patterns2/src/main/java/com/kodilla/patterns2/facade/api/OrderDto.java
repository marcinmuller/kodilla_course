package com.kodilla.patterns2.facade.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 19.10.17.
 */
public class OrderDto {
    private final List<ItemDto> items = new ArrayList<>();
    public void addItem(final ItemDto item){
        items.add(item);
    }
    public List<ItemDto> getItems(){
        return items;
    }
}
