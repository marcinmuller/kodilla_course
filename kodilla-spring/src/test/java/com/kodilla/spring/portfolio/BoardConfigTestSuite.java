package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Marcin Muller on 13.08.17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardConfigTestSuite {
    @Test
    public void testTaskAddToToDoList(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board=context.getBean(Board.class);
        //when
        board.getToDoList().getTasks().add("1. do zrobienia");
        String result=board.getToDoList().getTasks().get(0);
        //then
        Assert.assertEquals("1. do zrobienia", result);

    }
    @Test
    public void testTaskAddToDoneList(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board=context.getBean(Board.class);
        //when
        board.getDoneList().getTasks().add("1. zrobione");
        String result=board.getDoneList().getTasks().get(0);
        //then
        Assert.assertEquals("1. zrobione", result);

    }
    @Test
    public void testTaskAddToInProgressList(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board=context.getBean(Board.class);
        //when
        board.getInProgressList().getTasks().add("1. w toku");
        String result=board.getInProgressList().getTasks().get(0);
        //then
        Assert.assertEquals("1. w toku", result);

    }
}
