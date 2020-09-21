package com.kodilla.testing.forum.statistics;

import java.util.*;

public class OperationsWithData {

    int a;
    int b;
    int c;
    double d;
    double e;

    private Statistics statistics;

    public OperationsWithData(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        int amountOfForumUsers = statistics.usersNames().size();
        int amountOfPosts = statistics.postsCount();
        int amountOfComments = statistics.commentsCount();
        double averageAmountOfPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        double averageAmountOfCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        a = amountOfForumUsers;
        b = amountOfPosts;
        c = amountOfComments;
        d = averageAmountOfPostsPerUser;
        e = averageAmountOfCommentsPerUser;
    }

    //public void showData() {
    //  OperationsWithData xyz = new OperationsWithData(Statistics statistics);
    //xyz.calculateAdvStatistics(Statistics statistics);
    //System.out.println(a);
    //System.out.println(b);
    //System.out.println(c);
    //System.out.println(d);
    //System.out.println(e);
    //}
}
