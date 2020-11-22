package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("John");
        User user2 = new YGeneration("Paul");
        User user3 = new ZGeneration("Logan");

        //When
        String user1post = user1.sharePost();
        System.out.println(user1.getName() +" says that " + user1post);
        String user2post = user2.sharePost();
        System.out.println(user2.getName()+" says that "+user2post);
        String user3post = user3.sharePost();
        System.out.println(user1.getName()+" says that "+user3post);

        //Then
        Assertions.assertEquals(user1post,"He is using facebook");
        Assertions.assertEquals(user2post,"He is using snapchat");
        Assertions.assertEquals(user3post,"He is using twitter");
    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Mike");

        //When
        String userPost = user.sharePost();
        System.out.println(user.getName()+" says that "+ userPost);
        user.setSharePost(new SnapchatPublisher());
        userPost = user.sharePost();
        System.out.println(user.getName()+" says that "+user.sharePost()+" from now");

        //Then
        Assertions.assertEquals(userPost,"He is using snapchat");

    }
}
