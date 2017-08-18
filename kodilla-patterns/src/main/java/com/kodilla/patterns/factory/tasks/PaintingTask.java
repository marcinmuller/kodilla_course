package com.kodilla.patterns.factory.tasks;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class PaintingTask {
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    public void executeTask(){}
    public void getTaskName(){}
    public boolean isTaskExecuted(){
        return true;
    }
}
