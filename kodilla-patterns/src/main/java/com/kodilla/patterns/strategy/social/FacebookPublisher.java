package com.kodilla.patterns.strategy.social;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class FacebookPublisher implements SocialPublisher {
    public String share(){
        return "Facebook";
    }
}
