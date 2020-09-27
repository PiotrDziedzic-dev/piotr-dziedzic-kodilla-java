package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.*;

public class StreamMain {
    public static void main(String[] args) {
            Forum forum = new Forum();
            Map<Integer,ForumUser> mapOfUsers = forum.getList().stream()
            .filter(forumUser -> forumUser.getSex() == 'M')
            .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2000)
            .filter(forumUser -> forumUser.getAmountOfPosts() >= 1)
            .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));

            mapOfUsers.entrySet().stream()
                    .map(entry->entry.getKey()+":"+entry.getValue())
                    .forEach(System.out::println);

    }
}