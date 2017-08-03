package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList) {
        return taskLists.remove(taskList);
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" + "\n" +
                "name='" + name + '\'' + ",\n" +
                "taskLists=" + taskLists + "\n" +
                '}';
    }
    public double getAverageWorking() {
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long tasks=taskLists.stream()
                .filter(inProgressTasks::contains)
                .flatMap(s->s.getTasks().stream())
                .map(s->s.getCreated())
                .map(s->s.until(LocalDate.now(),DAYS))
                .reduce(0L,(s,t)->s=s+t);

        long quantity = taskLists.stream()
                .filter(inProgressTasks::contains)
                .flatMap(s -> s.getTasks().stream())
                .count();
        try {
            System.out.println("średnia ilość dni to " + tasks / quantity);
            return tasks / quantity;
        }catch (ArithmeticException e){
            System.out.println(e+" nie ma zadań w toku");
            return 0;
        }
    }
    public double getAverageWorking1(){
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        double tasks =taskLists.stream()
                .filter(inProgressTasks::contains)
                .flatMap(s->s.getTasks().stream())
                .mapToDouble(s->s.getCreated().until(LocalDate.now(),DAYS))
                .average()
                .getAsDouble();

        System.out.println("średnia to "+tasks);
        return tasks;
    }
}