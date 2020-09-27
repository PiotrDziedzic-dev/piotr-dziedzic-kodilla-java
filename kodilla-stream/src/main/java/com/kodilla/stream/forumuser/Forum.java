package com.kodilla.stream.forumuser;
import java.util.*;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser (1,"Paul",'M',10,1999,1,10));
        theUsersList.add(new ForumUser (2,"John",'M',20,2001,2,11));
        theUsersList.add(new ForumUser (3,"Adam",'M',30,2002,3,12));
        theUsersList.add(new ForumUser (4,"Eva",'F',40,2003,4,13));
        theUsersList.add(new ForumUser (5,"Camile",'F',50,2004,5,14));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUsersList);
    }

}
