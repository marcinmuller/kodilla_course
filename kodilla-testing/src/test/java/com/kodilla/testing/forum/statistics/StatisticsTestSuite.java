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
    public void testCalculateAdvStatistics11(){
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
        Assert.assertEquals(10, commentsNumber );
    }
    @Test
    public void testCalculateAdvStatistics12(){
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
        Assert.assertEquals(100,usersNumber );
    }
    @Test
    public void testCalculateAdvStatistics13(){
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
        Assert.assertEquals(0,postsNumber );
    }
    @Test
    public void testCalculateAdvStatistics14(){
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
        Assert.assertEquals(0, commentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics15(){
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
        Assert.assertEquals(0, postsPerUser,0 );
    }
    @Test
    public void testCalculateAdvStatistics16(){
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
        Assert.assertEquals(0.1,commentsPerUser,0);
    }
    @Test
    public void testCalculateAdvStatistics21(){
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
        Assert.assertEquals(10,commentsNumber );
    }
    @Test
    public void testCalculateAdvStatistics22(){
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
        Assert.assertEquals(100,usersNumber );
    }
    @Test
    public void testCalculateAdvStatistics23(){
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
        Assert.assertEquals(1000,postsNumber );
    }
    @Test
    public void testCalculateAdvStatistics24(){
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
        Assert.assertEquals(0.01,commentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics25(){
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
        Assert.assertEquals(10,postsPerUser,0);
    }
    @Test
    public void testCalculateAdvStatistics26(){
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
        Assert.assertEquals(0.1,commentsPerUser,0);
    }
    @Test
    public void testCalculateAdvStatistics31(){
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
        Assert.assertEquals(0,commentsNumber);
    }
    @Test
    public void testCalculateAdvStatistics32(){
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
        Assert.assertEquals(100,usersNumber );
    }
    @Test
    public void testCalculateAdvStatistics33(){
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
        Assert.assertEquals(0,postsNumber);
    }
    @Test
    public void testCalculateAdvStatistics34(){
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
        Assert.assertEquals(0,commentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics35(){
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
        Assert.assertEquals(0,postsPerUser,0 );
    }
    @Test
    public void testCalculateAdvStatistics36(){
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
        Assert.assertEquals(0,commentsPerUser,0);
    }
    @Test
    public void testCalculateAdvStatistics41(){
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
        Assert.assertEquals(10,commentsNumber);
    }
    @Test
    public void testCalculateAdvStatistics42(){
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
        Assert.assertEquals(100,usersNumber);
    }
    @Test
    public void testCalculateAdvStatistics43(){
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
        Assert.assertEquals(100,postsNumber );
    }
    @Test
    public void testCalculateAdvStatistics44(){
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
        Assert.assertEquals(0.1, commentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics45(){
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
        Assert.assertEquals(1,postsPerUser ,0);
    }
    @Test
    public void testCalculateAdvStatistics46(){
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
        Assert.assertEquals(0.1,commentsPerUser,0);
    }
    @Test
    public void testCalculateAdvStatistics51(){
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
        Assert.assertEquals(100,commentsNumber );
    }
    @Test
    public void testCalculateAdvStatistics52(){
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
        Assert.assertEquals(100,usersNumber );
    }
    @Test
    public void testCalculateAdvStatistics53(){
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
        Assert.assertEquals(10,postsNumber);
    }
    @Test
    public void testCalculateAdvStatistics54(){
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
        Assert.assertEquals(10,commentsPerPost,0 );
    }
    @Test
    public void testCalculateAdvStatistics55(){
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
        Assert.assertEquals(0.1,postsPerUser,0 );
    }
    @Test
    public void testCalculateAdvStatistics56(){
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
        Assert.assertEquals(1, commentsPerUser ,0);
    }
    @Test
    public void testCalculateAdvStatistics61(){
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
        Assert.assertEquals(10,commentsNumber );
    }
    @Test
    public void testCalculateAdvStatistics62(){
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
        Assert.assertEquals(0,usersNumber );
    }
    @Test
    public void testCalculateAdvStatistics63(){
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
        Assert.assertEquals(100,postsNumber );
    }
    @Test
    public void testCalculateAdvStatistics64(){
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
        System.out.println("6 gdy gdy liczba użytkowników = 0");;
        Assert.assertEquals(0.1, commentsPerPost,0 );
    }
    @Test
    public void testCalculateAdvStatistics65(){
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
        Assert.assertEquals(0,postsPerUser,0 );
    }
    @Test
    public void testCalculateAdvStatistics66(){
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
        Assert.assertEquals(0,commentsPerUser ,0);
    }
    @Test
    public void testCalculateAdvStatistics71(){
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
        Assert.assertEquals(10,commentsNumber );
    }
    @Test
    public void testCalculateAdvStatistics72(){
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
        Assert.assertEquals(100,usersNumber );
    }
    @Test
    public void testCalculateAdvStatistics73(){
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
        Assert.assertEquals(100,postsNumber );
    }
    @Test
    public void testCalculateAdvStatistics74(){
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
        Assert.assertEquals(0.1,commentsPerPost,0 );
    }
    @Test
    public void testCalculateAdvStatistics75(){
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
        Assert.assertEquals(1,postsPerUser,0 );
    }
    @Test
    public void testCalculateAdvStatistics76(){
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
        Assert.assertEquals( 0.1,commentsPerUser ,0);
    }
}
