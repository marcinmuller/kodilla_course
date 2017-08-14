package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Marcin Muller on 14.08.17.
 */
@Configuration
public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board() {
        toDoList = toDoList();
        inProgressList = inProgressList();
        doneList = doneList();
    }
    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean
    public TaskList doneList(){
        return new TaskList();
    }
}
