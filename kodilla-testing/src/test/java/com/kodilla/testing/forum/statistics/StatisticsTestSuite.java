package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Marcin Muller on 25.07.17.
 */
public class StatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics1(){
        //Given
        Statistics statistics=mock(Statistics.class);
        List<String> usersNames=new ArrayList<>();
        for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator=new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber=statisticsCalculator.getCommentsNumber();
        int usersNumber=statisticsCalculator.getUsersNumber();
        int postsNumber=statisticsCalculator.getPostsNumber();
        double commentsPerUser=statisticsCalculator.getCommentsPerUser();
        double postsPerUser=statisticsCalculator.getPostsPerUser();
        double commentsPerPost=statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("1 0 postów");
        Assert.assertTrue(commentsNumber==10 );
        Assert.assertTrue(usersNumber==100 );
        Assert.assertTrue(postsNumber==0 );
        Assert.assertTrue(commentsPerPost==0);
        Assert.assertTrue(postsPerUser==0 );
        Assert.assertTrue(commentsPerUser==0.1);
    }
    @Test
    public void testCalculateAdvStatistics2(){
        //Given
        Statistics statistics=mock(Statistics.class);
        List<String> usersNames=new ArrayList<>();
        for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator=new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber=statisticsCalculator.getCommentsNumber();
        int usersNumber=statisticsCalculator.getUsersNumber();
        int postsNumber=statisticsCalculator.getPostsNumber();
        double commentsPerUser=statisticsCalculator.getCommentsPerUser();
        double postsPerUser=statisticsCalculator.getPostsPerUser();
        double commentsPerPost=statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("2 1000 postów");
        Assert.assertTrue(commentsNumber==10 );
        Assert.assertTrue(usersNumber==100 );
        Assert.assertTrue(postsNumber==1000 );
        Assert.assertTrue(commentsPerPost==0.01);
        Assert.assertTrue(postsPerUser==10);
        Assert.assertTrue(commentsPerUser==0.1);
    }
    @Test
    public void testCalculateAdvStatistics3(){
        //Given
        Statistics statistics=mock(Statistics.class);
        List<String> usersNames=new ArrayList<>();
        for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator=new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber=statisticsCalculator.getCommentsNumber();
        int usersNumber=statisticsCalculator.getUsersNumber();
        int postsNumber=statisticsCalculator.getPostsNumber();
        double commentsPerUser=statisticsCalculator.getCommentsPerUser();
        double postsPerUser=statisticsCalculator.getPostsPerUser();
        double commentsPerPost=statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("3 0 komentarzy");
        Assert.assertTrue(commentsNumber==0);
        Assert.assertTrue(usersNumber==100 );
        Assert.assertTrue(postsNumber==0);
        Assert.assertTrue(commentsPerPost==0);
        Assert.assertTrue(postsPerUser==0 );
        Assert.assertTrue(commentsPerUser==0);
    }
    @Test
    public void testCalculateAdvStatistics4(){
        //Given
        Statistics statistics=mock(Statistics.class);
        List<String> usersNames=new ArrayList<>();
        for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator=new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber=statisticsCalculator.getCommentsNumber();
        int usersNumber=statisticsCalculator.getUsersNumber();
        int postsNumber=statisticsCalculator.getPostsNumber();
        double commentsPerUser=statisticsCalculator.getCommentsPerUser();
        double postsPerUser=statisticsCalculator.getPostsPerUser();
        double commentsPerPost=statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("4 gdy liczba komentarzy < liczba postów");
        Assert.assertTrue(commentsNumber==10);
        Assert.assertTrue(usersNumber==100);
        Assert.assertTrue(postsNumber==100 );
        Assert.assertTrue( commentsPerPost==0.1);
        Assert.assertTrue(postsPerUser==1 );
        Assert.assertTrue(commentsPerUser==0.1);
    }
    @Test
    public void testCalculateAdvStatistics5(){
        //Given
        Statistics statistics=mock(Statistics.class);
        List<String> usersNames=new ArrayList<>();
        for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator=new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber=statisticsCalculator.getCommentsNumber();
        int usersNumber=statisticsCalculator.getUsersNumber();
        int postsNumber=statisticsCalculator.getPostsNumber();
        double commentsPerUser=statisticsCalculator.getCommentsPerUser();
        double postsPerUser=statisticsCalculator.getPostsPerUser();
        double commentsPerPost=statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("5 gdy liczba komentarzy > liczba postów");
        Assert.assertTrue(commentsNumber==100 );
        Assert.assertTrue(usersNumber==100 );
        Assert.assertTrue(postsNumber==10 );
        Assert.assertTrue(commentsPerPost==10 );
        Assert.assertTrue(postsPerUser==0.1 && commentsPerUser==1);
    }
    @Test
    public void testCalculateAdvStatistics6(){
        //Given
        Statistics statistics=mock(Statistics.class);
        List<String> usersNames=new ArrayList<>();
     /*   for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }*/
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator=new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber=statisticsCalculator.getCommentsNumber();
        int usersNumber=statisticsCalculator.getUsersNumber();
        int postsNumber=statisticsCalculator.getPostsNumber();
        double commentsPerUser=statisticsCalculator.getCommentsPerUser();
        double postsPerUser=statisticsCalculator.getPostsPerUser();
        double commentsPerPost=statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        Assert.assertTrue(commentsNumber==10 );
        Assert.assertTrue(usersNumber==0 );
        Assert.assertTrue(postsNumber==100 );
        Assert.assertTrue( commentsPerPost==0.1 );
        Assert.assertTrue(postsPerUser==0 );
        Assert.assertTrue(commentsPerUser==0);
    }
    @Test
    public void testCalculateAdvStatistics7(){
        //Given
        Statistics statistics=mock(Statistics.class);
        List<String> usersNames=new ArrayList<>();
        for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator=new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber=statisticsCalculator.getCommentsNumber();
        int usersNumber=statisticsCalculator.getUsersNumber();
        int postsNumber=statisticsCalculator.getPostsNumber();
        double commentsPerUser=statisticsCalculator.getCommentsPerUser();
        double postsPerUser=statisticsCalculator.getPostsPerUser();
        double commentsPerPost=statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("7 gdy liczba użytkowników = 100");
        Assert.assertTrue(commentsNumber==10 );
        Assert.assertTrue(usersNumber==100 );
        Assert.assertTrue(postsNumber==100 );
        Assert.assertTrue(commentsPerPost==0.1 );
        Assert.assertTrue(postsPerUser==1 && commentsPerUser==0.1);
    }
}
