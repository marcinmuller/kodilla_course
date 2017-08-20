package com.kodilla.patterns.factory.tasks;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isDone=false;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
