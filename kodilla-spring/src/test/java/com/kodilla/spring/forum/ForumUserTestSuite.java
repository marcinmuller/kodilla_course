package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Marcin Muller on 12.08.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        //when
        ForumUser forumUser=context.getBean(ForumUser.class);
        String result=forumUser.getUsername();
        //then
        Assert.assertEquals("John Smith",result);
    }
}
