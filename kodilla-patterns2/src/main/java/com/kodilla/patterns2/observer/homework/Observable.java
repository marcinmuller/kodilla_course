package com.kodilla.patterns2.observer.homework;


/**
 * Created by Marcin Muller on 29.10.17.
 */
public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
