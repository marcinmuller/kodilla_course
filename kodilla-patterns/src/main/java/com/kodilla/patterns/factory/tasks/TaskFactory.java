package com.kodilla.patterns.factory.tasks;

/**
 * Created by Marcin Muller on 19.08.17.
 */
public class TaskFactory {
    public static final String DRIVING="DRIVING";
    public static final String PAINTING="PAINTING";
    public static final String SHOPPING="SHOPPING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case DRIVING:
                return new DrivingTask("rypnąć się samochodem","do okoła","samochód");
            case PAINTING:
                return new PaintingTask("pomalować pokój","biały","pokój");
            case SHOPPING:
                return new ShoppingTask("lajsnąć szabelek i pyrki na wildeckim","szabelek i pyrki",5);
            default:
                return null;
        }
    }
}
