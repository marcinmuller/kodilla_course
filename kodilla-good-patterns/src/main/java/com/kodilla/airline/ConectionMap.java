package com.kodilla.airline;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class ConectionMap {
    private Set<Flight> set=new HashSet<>();;

    public ConectionMap() {
        set.add(new Flight("gdańsk", "wrocław"));
        set.add(new Flight("gdańsk", "kraków"));
        set.add(new Flight("poznań","wrocław"));
        set.add(new Flight("wrocław","gdańsk"));
        set.add(new Flight("kraków", "wrocław"));
    }

    public Set<Flight> getSet() {
        return set;
    }
}
