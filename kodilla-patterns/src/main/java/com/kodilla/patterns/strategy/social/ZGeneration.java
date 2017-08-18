package com.kodilla.patterns.strategy.social;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class ZGeneration extends User {
    public ZGeneration() {
        publisher=new SnapchatPublisher();
    }
}
