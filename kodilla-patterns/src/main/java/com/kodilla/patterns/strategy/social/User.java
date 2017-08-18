package com.kodilla.patterns.strategy.social;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class User {
    protected SocialPublisher publisher;
    public void setPublisher(SocialPublisher socialPublisher){
        publisher=socialPublisher;
    }
    public String sharePost(){
        return "sharing through "+publisher.share();
    }
}
