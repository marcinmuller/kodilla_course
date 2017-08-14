package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

/**
 * Created by Marcin Muller on 11.08.17.
 */
@Component
public class ForumUser {
    private String username;

    public ForumUser() {
        username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
