package com.kodilla.patterns2.observer.homework;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class HomeworkQueue implements Observable{
    private final Deque<Homework> homeworkQueue;
    private final List<Observer> observers;
    private final String name;

    public HomeworkQueue(String name) {
        this.name=name;
        observers = new ArrayList<>();
        homeworkQueue = new ArrayDeque<>();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void notifyObservers(){
        for (Observer observer: observers){
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void addHomework(Homework homework){
        homeworkQueue.offer(homework);
        notifyObservers();
    }

    public Deque<Homework> getHomework() {
        return homeworkQueue;
    }
}
