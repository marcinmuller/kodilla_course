package com.kodilla.food1;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class Producer {
    private String name;
    private Map<String,Quantity> map;

    public Producer(String name) {
        this.name = name;
        Map<String, Quantity> map=new HashMap<>();
    }

    public void info(){
        System.out.println(name);
        for (Map.Entry<String,Quantity> m: map.entrySet()){
            System.out.println(m);
        }
    }
}
