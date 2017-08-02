package com.kodilla.exception.test1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcin Muller on 02.08.17.
 */
public class Flightmap {
    public void findFilght(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> map=new HashMap<>();
        map.put("Katania",true);
        map.put("Palermo",true);
        map.put("Syrakuzy",false);
        map.put("Trapani",true);
        if(map.get(flight.getDestination())!=null) {
            if(map.get(flight.getDestination())==true) System.out.println(flight.getOrigin()+" ---> "+flight.getDestination());
            else System.out.println(flight.getOrigin()+" -/-> "+flight.getDestination());
        }
        throw new RouteNotFoundException(flight.getDestination());

    }
}
