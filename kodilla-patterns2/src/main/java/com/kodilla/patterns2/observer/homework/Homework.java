package com.kodilla.patterns2.observer.homework;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class Homework {
    private String student;
    private String contents;
    private int grade;

    public Homework(String student, String contents) {
        this.student = student;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Homework homework = (Homework) o;

        if (student != null ? !student.equals(homework.student) : homework.student != null) return false;
        return contents != null ? contents.equals(homework.contents) : homework.contents == null;
    }

    @Override
    public int hashCode() {
        int result = student != null ? student.hashCode() : 0;
        result = 31 * result + (contents != null ? contents.hashCode() : 0);
        return result;
    }
}
