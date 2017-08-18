package com.kodilla.patterns.strategy.social;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class Millenials extends User {
    public Millenials() {
        publisher=new FacebookPublisher();
    }
}
