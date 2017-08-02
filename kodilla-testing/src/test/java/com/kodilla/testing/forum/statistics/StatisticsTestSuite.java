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
    public void testCalculateAdvStatisticscommentsNumberNoPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getCommentsNumber();
        //Then
        System.out.println("1 0 postów");
        Assert.assertEquals(10, commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsUsersNumberNOPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator.getUsersNumber();
        //Then
        System.out.println("1 0 postów");
        Assert.assertEquals(100, usersNumber);
    }

    @Test
    public void testCalculateAdvStatisticsPostsNumberNoPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getPostsNumber();
        //Then
        System.out.println("1 0 postów");
        Assert.assertEquals(0, postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsComPPostNoPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("1 0 postów");
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsPostsPuserNoPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getPostsPerUser();
        //Then
        System.out.println("1 0 postów");
        Assert.assertEquals(0, postsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsComPUserNoPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator.getCommentsPerUser();
        //Then
        System.out.println("1 0 postów");
        Assert.assertEquals(0.1, commentsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsComNumber1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getCommentsNumber();
        //Then
        System.out.println("2 1000 postów");
        Assert.assertEquals(10, commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsUserNumber1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator.getUsersNumber();
        //Then
        System.out.println("2 1000 postów");
        Assert.assertEquals(100, usersNumber);
    }

    @Test
    public void testCalculateAdvStatisticspostNumber1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getPostsNumber();
        //Then
        System.out.println("2 1000 postów");
        Assert.assertEquals(1000, postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsComPPost1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("2 1000 postów");
        Assert.assertEquals(0.01, commentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsPostPuser1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getPostsPerUser();
        //Then
        System.out.println("2 1000 postów");
        Assert.assertEquals(10, postsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsComPUser1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator.getCommentsPerUser();
        //Then
        System.out.println("2 1000 postów");
        Assert.assertEquals(0.1, commentsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCommNoCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getCommentsNumber();
        //Then
        System.out.println("3 0 komentarzy");
        Assert.assertEquals(0, commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsUserNumberNoCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator.getUsersNumber();
        //Then
        System.out.println("3 0 komentarzy");
        Assert.assertEquals(100, usersNumber);
    }

    @Test
    public void testCalculateAdvStatisticspostNumberNoCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getPostsNumber();
        //Then
        System.out.println("3 0 komentarzy");
        Assert.assertEquals(0, postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsComPpostNoCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("3 0 komentarzy");
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsPostPUserNoCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getPostsPerUser();
        //Then
        System.out.println("3 0 komentarzy");
        Assert.assertEquals(0, postsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsComPusreNoCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator.getCommentsPerUser();
        //Then
        System.out.println("3 0 komentarzy");
        Assert.assertEquals(0, commentsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticsComNumberMorePosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getCommentsNumber();
        //Then
        System.out.println("4 gdy liczba komentarzy < liczba postów");
        Assert.assertEquals(10, commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsuserNumberMorePosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator.getUsersNumber();
        //Then
        System.out.println("4 gdy liczba komentarzy < liczba postów");
        Assert.assertEquals(100, usersNumber);
    }

    @Test
    public void testCalculateAdvStatisticspostsNUmberMOrePosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getPostsNumber();
        //Then
        System.out.println("4 gdy liczba komentarzy < liczba postów");
        Assert.assertEquals(100, postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerPostmorePosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("4 gdy liczba komentarzy < liczba postów");
        Assert.assertEquals(0.1, commentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticspostsPerUsermorePosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getPostsPerUser();
        //Then
        System.out.println("4 gdy liczba komentarzy < liczba postów");
        Assert.assertEquals(1, postsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerUserMOrePosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator.getCommentsPerUser();
        //Then
        System.out.println("4 gdy liczba komentarzy < liczba postów");
        Assert.assertEquals(0.1, commentsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerUserMoreCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getCommentsNumber();
        //Then
        System.out.println("5 gdy liczba komentarzy > liczba postów");
        Assert.assertEquals(100, commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsusersNumbermoreCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator.getUsersNumber();
        //Then
        System.out.println("5 gdy liczba komentarzy > liczba postów");
        Assert.assertEquals(100, usersNumber);
    }

    @Test
    public void testCalculateAdvStatisticspostsNumberMoreCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getPostsNumber();
        //Then
        System.out.println("5 gdy liczba komentarzy > liczba postów");
        Assert.assertEquals(10, postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerPostmoeCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("5 gdy liczba komentarzy > liczba postów");
        Assert.assertEquals(10, commentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticspostsPerUserMOreCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getPostsPerUser();
        //Then
        System.out.println("5 gdy liczba komentarzy > liczba postów");
        Assert.assertEquals(0.1, postsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticscommentPerUserMoreCom() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator.getCommentsPerUser();
        //Then
        System.out.println("5 gdy liczba komentarzy > liczba postów");
        Assert.assertEquals(1, commentsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticscommentsNumberNoUser() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
     /*   for(int i=0;i<100;i++){
            usersNames.add("aaa"+i);
        }*/
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getCommentsNumber();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        Assert.assertEquals(10, commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsusersNumberNousers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator.getUsersNumber();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        Assert.assertEquals(0, usersNumber);
    }

    @Test
    public void testCalculateAdvStatisticspostsNumberNOusers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getPostsNumber();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        Assert.assertEquals(100, postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerPostNoUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        ;
        Assert.assertEquals(0.1, commentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticspostsPerUserNoUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getPostsPerUser();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        Assert.assertEquals(0, postsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerUserNoUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator.getCommentsPerUser();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        Assert.assertEquals(0, commentsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticscommentsNumber100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getCommentsNumber();
        //Then
        System.out.println("7 gdy liczba użytkowników = 100");
        Assert.assertEquals(10, commentsNumber);
    }

    @Test
    public void testCalculateAdvStatisticsusersNumber100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator.getUsersNumber();
        //Then
        System.out.println("7 gdy liczba użytkowników = 100");
        Assert.assertEquals(100, usersNumber);
    }

    @Test
    public void testCalculateAdvStatisticspostsNumber100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getPostsNumber();
        //Then
        System.out.println("7 gdy liczba użytkowników = 100");
        Assert.assertEquals(100, postsNumber);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerPost100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getCommentsPerPost();
        //Then
        System.out.println("7 gdy liczba użytkowników = 100");
        Assert.assertEquals(0.1, commentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticspostsPerUser100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getPostsPerUser();
        //Then
        System.out.println("7 gdy liczba użytkowników = 100");
        Assert.assertEquals(1, postsPerUser, 0);
    }

    @Test
    public void testCalculateAdvStatisticscommentsPerUser100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("aaa" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator.getCommentsPerUser();
        //Then
        System.out.println("7 gdy liczba użytkowników = 100");
        Assert.assertEquals(0.1, commentsPerUser, 0);
    }
}
