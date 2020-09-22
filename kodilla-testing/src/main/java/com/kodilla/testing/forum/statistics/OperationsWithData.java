package com.kodilla.testing.forum.statistics;

import java.util.*;

public class OperationsWithData {

    int amountOfPosts1;
    int amountOfForumUsers1;
    int amountOfComments1;
    double averageAmountOfPostsPerUser1;
    double averageAmountOfCommentsPerUser1;

    private Statistics statistics;

    public OperationsWithData(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getAverageAmountOfPostsPerUser() {
        return averageAmountOfPostsPerUser1;
    }

    public double getAverageAmountOfCommentsPerUser() {
        return averageAmountOfCommentsPerUser1;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        double averageAmountOfPostsPerUser;
        double averageAmountOfCommentsPerUser;
        int amountOfForumUsers = statistics.usersNames().size();
        int amountOfPosts = statistics.postsCount();
        int amountOfComments = statistics.commentsCount();
        if (statistics.usersNames().size() != 0 ) {
            averageAmountOfPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
            averageAmountOfCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();

        } else {
            averageAmountOfPostsPerUser = 0.00000000000001;
            averageAmountOfCommentsPerUser = 0.00000000000009;
        }
        amountOfForumUsers1 = amountOfForumUsers;
        amountOfPosts1 = amountOfPosts;
        amountOfComments1 = amountOfComments;
        averageAmountOfPostsPerUser1 = averageAmountOfPostsPerUser;
        averageAmountOfCommentsPerUser1 = averageAmountOfCommentsPerUser;
    }

    public void showData() {
      OperationsWithData xyz = new OperationsWithData(statistics);
    xyz.calculateAdvStatistics(statistics);
    System.out.println(amountOfForumUsers1);
    System.out.println(amountOfPosts1);
    System.out.println(amountOfComments1);
    System.out.println(averageAmountOfPostsPerUser1);
    System.out.println(averageAmountOfCommentsPerUser1);
    }
}
