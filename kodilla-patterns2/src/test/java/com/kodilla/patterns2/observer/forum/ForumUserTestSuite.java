package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import  static org.junit.Assert.assertEquals;

/**
 * Created by Marcin Muller on 29.10.17.
 */
public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("john smith");
        ForumUser ivoneEscobar = new ForumUser("ivone escobar");
        ForumUser jessiePinkman = new ForumUser("jessie pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //when
        javaHelpForum.addPost("hi");
        javaHelpForum.addPost("hallo!");
        javaToolsForum.addPost("help");
        javaHelpForum.addPost("bye bye");
        javaToolsForum.addPost(":)");
        //then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5,jessiePinkman.getUpdateCount());


    }
}
