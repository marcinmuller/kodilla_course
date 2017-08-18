package com.kodilla.patterns.strategy.social;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class YGeneration extends User {
    public YGeneration() {
        publisher=new TwitterPublisher();
    }
}
