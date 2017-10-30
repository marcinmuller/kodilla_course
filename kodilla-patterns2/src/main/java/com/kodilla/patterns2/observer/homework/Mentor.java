package com.kodilla.patterns2.observer.homework;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class Mentor implements Observer {
    private String name;
    private Set<Homework> homeworkSet;

    public Mentor(String name) {
        this.name = name;
        homeworkSet=new HashSet<>();
    }

    @Override
    public void update(HomeworkQueue homeworkQueue){
        System.out.println("new homework: "+homeworkQueue.getHomework().getLast());
        homeworkSet.add(homeworkQueue.getHomework().getLast());
    }

    public void giveAGrade(Homework homework, int grade){
        homework.setGrade(grade);
        homeworkSet.remove(homework);
    }

    public Set<Homework> getHomeworkSet() {
        return homeworkSet;
    }
}
