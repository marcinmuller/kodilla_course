package com.kodilla.stream.forum;

import java.time.LocalDate;

/**
 * Created by Marcin Muller on 26.07.17.
 */
public final class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(final int id, final String userName, final char sex, final int birthDateYear, final int birthDateMonth, final int birthDateDay, final int postsNumber) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(birthDateYear,birthDateMonth,birthDateDay);
        this.postsNumber = postsNumber;
    }

    public int getId() {
        return id;
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
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}