package com.kodilla.stream.forum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 26.07.17.
 */
public class Forum {
    private final List<ForumUser> forumUsersList=new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1,"aa",'F', 1900,12,11, 100));
        forumUsersList.add(new ForumUser(2,"bb",'M', 1970,11,10, 0));
        forumUsersList.add(new ForumUser(3,"cc",'M', 1900,10,18, 10));
        forumUsersList.add(new ForumUser(4,"dd",'F', 2011,7,1, 15));
        forumUsersList.add(new ForumUser(5,"ee",'M', 1999,1,2, 10));
        forumUsersList.add(new ForumUser(6,"ff",'F', 1955,2,3, 10));
        forumUsersList.add(new ForumUser(7,"gg",'M', 1997,7,26, 10));

    }
    public List<ForumUser> getUserList(){
        List<ForumUser> list=new ArrayList<>(forumUsersList);
        return list;
    }

}