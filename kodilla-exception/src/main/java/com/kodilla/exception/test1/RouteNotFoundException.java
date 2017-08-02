package com.kodilla.exception.test1;

/**
 * Created by Marcin Muller on 02.08.17.
 */
public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message) {
        super(message);
    }
}
