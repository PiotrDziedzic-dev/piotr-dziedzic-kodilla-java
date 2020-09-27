package com.kodilla.stream.forumuser;

import java.time.*;

public final class ForumUser {
    final private int id;
    final private String name;
    final private char sex;
    final private LocalDate dateOfBirth;
    final private int amountOfPosts;

    public ForumUser(final int id, final String name, final char sex,
                     final int amountOfPosts,int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.amountOfPosts = amountOfPosts;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", amountOfPosts=" + amountOfPosts +
                '}';
    }
}
