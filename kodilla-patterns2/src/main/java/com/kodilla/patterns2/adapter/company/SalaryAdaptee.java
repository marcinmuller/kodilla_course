package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees){
        CompanySalaryProcessor theProcessor =new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
