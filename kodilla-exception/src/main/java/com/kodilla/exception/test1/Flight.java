package com.kodilla.exception.test1;

/**
 * Created by Marcin Muller on 02.08.17.
 */
public class Flight {
    private String origin;
    private String destination;

    public Flight(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}
