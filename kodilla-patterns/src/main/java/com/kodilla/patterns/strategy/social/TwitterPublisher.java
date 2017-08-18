package com.kodilla.patterns.strategy.social;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class TwitterPublisher implements SocialPublisher {
    public String share(){
        return "Twitter";
    }
}
