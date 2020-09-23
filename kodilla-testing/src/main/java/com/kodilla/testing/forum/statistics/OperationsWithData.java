package com.kodilla.testing.forum.statistics;

import java.util.*;

public class OperationsWithData {

    private int amountOfPosts;
    private int amountOfForumUsers;
    private int amountOfComments;
    private double averageAmountOfPostsPerUser;
    private double averageAmountOfCommentsPerUser;

    private Statistics statistics;


    public OperationsWithData(Statistics statistics) { this.statistics = statistics;
    }

    public double getAverageAmountOfPostsPerUser() {
        return averageAmountOfPostsPerUser;
    }

    public double getAverageAmountOfCommentsPerUser() {
        return averageAmountOfCommentsPerUser;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        int amountOfForumUsers = statistics.usersNames().size();
        int amountOfPosts = statistics.postsCount();
        int amountOfComments = statistics.commentsCount();

        if (statistics.usersNames().size() != 0 ) {
            averageAmountOfPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
            averageAmountOfCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
            System.out.println("DIVIDING BY 0 IS IMPOSSIBLE !!!");
        } else {
            double averageAmountOfPostsPerUser = 0;
            double averageAmountOfCommentsPerUser = 0;
        }
        amountOfForumUsers = statistics.usersNames().size();
        amountOfPosts = statistics.postsCount();
        amountOfComments = statistics.commentsCount();

    }

    public void showData() {
      OperationsWithData xyz = new OperationsWithData(statistics);
    xyz.calculateAdvStatistics(statistics);
    System.out.println(amountOfForumUsers);
    System.out.println(amountOfPosts);
    System.out.println(amountOfComments);
    System.out.println(averageAmountOfPostsPerUser);
    System.out.println(averageAmountOfCommentsPerUser);
    }
}
