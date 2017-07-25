package com.kodilla.testing.forum.statistics;

/**
 * Created by Marcin Muller on 25.07.17.
 */
public class StatisticsCalculator {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;
    public void calculateAdvStatistics(Statistics statistics){
        usersNumber=statistics.usersNames().size();
        postsNumber=statistics.postsCount();
        commentsNumber=statistics.commentsCount();
        postsPerUser=(usersNumber!=0 ? (double)postsNumber/usersNumber : 0);
        commentsPerPost=(postsNumber!=0 ? (double)commentsNumber/postsNumber : 0);
        commentsPerUser=(usersNumber!=0 ? (double)commentsNumber/usersNumber : 0);
    }
    public void ShowStatistics(){
        System.out.println("number of userss "+usersNumber+"\nnumber of posts "+postsNumber+"\nnumber of comments "
                +commentsNumber+"\nposts per user "+postsPerUser+"\ncomments per user "+commentsPerUser+"\ncomments per post "+commentsPerPost);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

}
