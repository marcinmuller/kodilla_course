package com.kodilla.food;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class AllProducers {
    public void addProducers() {
        Map<String, Quantity> extraFoodMap = new HashMap<>();
        extraFoodMap.put("jabłka",new Quantity(250,"kg"));
        extraFoodMap.put("gruszki", new Quantity(150,"kg"));
        extraFoodMap.put("śliwki", new Quantity(150, "kg"));
        Producer extraFood = new Producer("Extra Food", extraFoodMap);

        Map<String,Quantity> healthyMap=new HashMap<>();
        healthyMap.put("sok z granatów", new Quantity(500, "butelki"));
        healthyMap.put("ksylitol", new Quantity(2000, "g"));
        Producer healthy=new Producer("Healthy Food", healthyMap);

        Map<String,Quantity> glutenMap=new HashMap<>();
        glutenMap.put("sól", new Quantity(25,"worki"));
        glutenMap.put("woda", new Quantity(300, "l"));
        Producer gluten=new Producer("Gluten Free",glutenMap);
    }
}
