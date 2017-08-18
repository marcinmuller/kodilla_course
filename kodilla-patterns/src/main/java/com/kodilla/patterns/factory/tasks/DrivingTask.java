package com.kodilla.patterns.factory.tasks;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class DrivingTask {
    private String taskName;
    private String where;
    private String using;
    private static boolean isDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    public void executeTask(){}
    public void getTaskName(){}
    public boolean isTaskExecuted(){
        return isDone;
    }
}
