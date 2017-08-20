package com.kodilla.patterns.factory.tasks;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;
    private boolean isDone=false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    public void executeTask(){
            isDone=true;
    }
    public String getTaskName(){
        return taskName;
    }
    public boolean isTaskExecuted(){
        return isDone;
    }
}
