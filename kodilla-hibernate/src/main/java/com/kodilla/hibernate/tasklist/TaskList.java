package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Muller on 05.09.17.
 */
@Entity
@Table(name="TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;
    private List<Task> tasks=new ArrayList<>();

    private void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @OneToMany(targetEntity = Task.class,mappedBy = "taskList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Task> getTasks() {

        return tasks;
    }

    public TaskList() {
    }

    public String getDescription() {
        return description;
    }

    @Column(name="LISTNAME")
    public String getListName() {

        return listName;
    }

    @NotNull
    @Id
    @GeneratedValue
    @Column(unique = true)
    public int getId() {

        return id;
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setListName(String listName) {

        this.listName = listName;
    }
}
