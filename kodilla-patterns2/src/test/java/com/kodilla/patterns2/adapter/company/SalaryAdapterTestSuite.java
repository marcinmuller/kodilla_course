package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary() {
        //given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //when
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());
        //then
        System.out.println(totalSalary);
        Assert.assertEquals(totalSalary,6000.0,0);
    }
}
