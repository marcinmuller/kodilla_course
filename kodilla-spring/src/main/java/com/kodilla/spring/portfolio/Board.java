package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

/**
 * Created by Marcin Muller on 14.08.17.
 */
//@Component
public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board( TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getInProgressList() {

        return inProgressList;
    }

    public TaskList getToDoList() {

        return toDoList;
    }
}