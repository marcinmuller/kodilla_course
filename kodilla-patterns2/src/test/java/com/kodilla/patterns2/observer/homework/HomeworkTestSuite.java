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
        Homework homework1 = new Homework("111","k1");
        Homework homework2 = new Homework("222","k1");
        Homework homework3 = new Homework("333","k1");
        Homework homework4 = new Homework("444","k1");
        Homework homework5 = new Homework("777","k2");
        Homework homework6 = new Homework("444","k2");
        Homework homework7 = new Homework("777","k3");
        Homework homework8 = new Homework("333","k3");
        Homework homework9 = new Homework("444","k3");
        HomeworkQueue homeworkQueue1 = new HomeworkQueue("k1");
        HomeworkQueue homeworkQueue2 = new HomeworkQueue("k2");
        HomeworkQueue homeworkQueue3 = new HomeworkQueue("k3");
        Mentor mentor1 = new Mentor("nn1");
        Mentor mentor2 = new Mentor("nn2");
        homeworkQueue1.registerObserver(mentor1);
        homeworkQueue2.registerObserver(mentor2);
        homeworkQueue3.registerObserver(mentor2);

        //when
        homeworkQueue1.addHomework(homework1);
        homeworkQueue1.addHomework(homework2);
        homeworkQueue1.addHomework(homework3);
        homeworkQueue1.addHomework(homework4);

        homeworkQueue2.addHomework(homework5);
        homeworkQueue2.addHomework(homework6);

        homeworkQueue3.addHomework(homework7);
        homeworkQueue3.addHomework(homework8);
        homeworkQueue3.addHomework(homework9);

        mentor1.giveAGrade(homework2,2);
        mentor1.giveAGrade(homework3,5);

        //then
        Assert.assertEquals(2,mentor1.getHomeworkSet().size());
        Assert.assertEquals(5,mentor2.getHomeworkSet().size());
    }
}
