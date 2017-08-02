package com.kodilla.exception.test1;

/**
 * Created by Marcin Muller on 02.08.17.
 */
public class FlightRunner {
    public static void main(String args[]){
        Flight flight1=new Flight("Radom", "Katania");
        Flight flight2=new Flight("Radom","Syrakuzy");
        Flight flight3=new Flight("Radom", "Segesta");
        Flightmap flightmap=new Flightmap();
        try {
            flightmap.findFilght(flight3);
        }catch (RouteNotFoundException e){
            System.out.println("error!!!!"+e);
        }
    }
}
