package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Marcin Muller on 14.08.17.
 */
@Configuration
public class BoardConfig {
    @Bean
    public Board board(){
        return new Board(toDoList(),inProgressList(),doneList());
    }
    @Bean
//    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean
//    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean
//    @Scope("prototype")
    public TaskList doneList(){
        return new TaskList();
    }
}
