package com.kodilla.good.patterns.challenges;

public class User {

    private final String userName;
    private final String userSurname;
    private final String userEmail;

    public User(String userName, String userSurname, String userEmail) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}