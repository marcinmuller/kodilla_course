package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 14.08.17.
 */
//@Component
public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks  = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }
}
