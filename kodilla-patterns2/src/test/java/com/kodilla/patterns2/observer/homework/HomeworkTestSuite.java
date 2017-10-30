package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class HomeworkTestSuite {
    @Test
    public void testHomework(){
        //given
        Homework homework1 = new Homework("111");
        Homework homework2 = new Homework("222");
        Homework homework3 = new Homework("333");
        Homework homework4 = new Homework("444");
        HomeworkQueue homeworkQueue = new HomeworkQueue("k1");
        Mentor mentor1 = new Mentor("nn");
        homeworkQueue.registerObserver(mentor1);
        //when
        homeworkQueue.addHomework(homework1);
        homeworkQueue.addHomework(homework2);
        homeworkQueue.addHomework(homework3);
        homeworkQueue.addHomework(homework4);
        mentor1.giveAGrade(homework2,2);
        mentor1.giveAGrade(homework3,5);

        //then
        Assert.assertEquals(2,mentor1.getHomeworkSet().size());
    }
}
