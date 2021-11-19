package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsNumberPerUser;
    private double averageCommentsNumberPerUser;
    private double averageCommentsNumberPerPost;

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public double getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public double getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        averagePostsNumberPerUser = (double) postsNumber / usersNumber;
        averageCommentsNumberPerUser = (double) commentsNumber / usersNumber;
        averageCommentsNumberPerPost = (double) commentsNumber / postsNumber;
    }

    public void showStatistics() {
        System.out.println("The number of users: " + usersNumber);
        System.out.println("The number of posts: " + postsNumber);
        System.out.println("The number of comments: " + commentsNumber);
        System.out.println("The average number of posts number per user: " + averagePostsNumberPerUser);
        System.out.println("The average number of comments number per user: " + averageCommentsNumberPerUser);
        System.out.println("The average number of comments per post: " + averageCommentsNumberPerPost);
    }
}
