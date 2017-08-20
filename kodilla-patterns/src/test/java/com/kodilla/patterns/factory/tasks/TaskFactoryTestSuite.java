package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 19.08.17.
 */
public class TaskFactoryTestSuite {
    @Test
    public void testTasksFactoryDRIVING() {
        //given
        TaskFactory taskFactory=new TaskFactory();
        //when
        Task driving=taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("rypnąć się samochodem",driving.getTaskName());

    }
    @Test
    public void testTasksFactoryPAINTING() {
        //given
        TaskFactory taskFactory=new TaskFactory();
        //when
        Task painting=taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("pomalować pokój",painting.getTaskName());

    }
    @Test
    public void testTasksFactorySHOPPING() {
        //given
        TaskFactory taskFactory=new TaskFactory();
        //when
        Task driving=taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("lajsnąć szabelek i pyrki na wildeckim",driving.getTaskName());

    }

    @Test
    public void testTasksFactoryDRIVINGExecuted() {
        //given
        TaskFactory taskFactory=new TaskFactory();
        //when
        Task driving=taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals(false, driving.isTaskExecuted());
        driving.executeTask();
        Assert.assertEquals(true, driving.isTaskExecuted());

    }
    @Test
    public void testTasksFactoryPAINTINGExecuted() {
        //given
        TaskFactory taskFactory=new TaskFactory();
        //when
        Task painting=taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals(false, painting.isTaskExecuted());
        painting.executeTask();
        Assert.assertEquals(true, painting.isTaskExecuted());

    }
    @Test
    public void testTasksFactorySHOPPINGExecuted() {
        //given
        TaskFactory taskFactory=new TaskFactory();
        //when
        Task shopping=taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(false, shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertEquals(true, shopping.isTaskExecuted());

    }
}
