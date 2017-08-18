package com.kodilla.patterns.factory.tasks;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask(){}
    public void getTaskName(){}
    public boolean isTaskExecuted(){
        return true;
    }
}
