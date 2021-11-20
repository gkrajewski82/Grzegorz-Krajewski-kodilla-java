package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "Janek", 'M', 2001, 11, 19, 30));
        userList.add(new ForumUser(002, "Teodor", 'M', 2000, 7, 23, 0));
        userList.add(new ForumUser(003, "Joanna", 'F', 1999, 2, 17, 12));
        userList.add(new ForumUser(004, "Andrzej", 'M', 2002, 9, 12, 43));
        userList.add(new ForumUser(005, "Ania", 'F', 2010, 10, 11, 27));
        userList.add(new ForumUser(006, "Zygmunt", 'M', 1992, 12, 8, 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}