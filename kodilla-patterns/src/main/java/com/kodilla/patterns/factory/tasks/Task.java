package com.kodilla.patterns.factory.tasks;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public interface Task {
    void executeTask();
    void getTaskName();
    boolean isTaskExecuted();
}
