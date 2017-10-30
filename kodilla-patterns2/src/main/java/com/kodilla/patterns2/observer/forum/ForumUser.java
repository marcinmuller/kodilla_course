package com.kodilla.patterns2.observer.forum;

/**
 * Created by Marcin Muller on 29.10.17.
 */
public class ForumUser implements Observer {
    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic){
        System.out.println(username+": new messages in topic "+forumTopic.getName()+"\n"+" (total: "+forumTopic.getMessages().size()+" messages");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public String getUsername() {

        return username;
    }
}
