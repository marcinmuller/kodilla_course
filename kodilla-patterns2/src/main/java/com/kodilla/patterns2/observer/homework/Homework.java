package com.kodilla.patterns2.observer.homework;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class Homework {
    private String contents;
    private int grade;

    public Homework(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return contents;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
