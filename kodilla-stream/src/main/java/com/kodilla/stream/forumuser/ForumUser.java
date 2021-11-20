package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identificator;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(final int identificator, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postsNumber) {
        this.identificator = identificator;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getIdentificator() {
        return identificator;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identificator=" + identificator +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (identificator != forumUser.identificator) return false;
        if (sex != forumUser.sex) return false;
        if (postsNumber != forumUser.postsNumber) return false;
        if (!userName.equals(forumUser.userName)) return false;
        return birthDate.equals(forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = identificator;
        result = 31 * result + userName.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + postsNumber;
        return result;
    }
}