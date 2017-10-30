package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public interface SalaryProcessor {
    BigDecimal calculateSalaries(List<Employee> employees);
}
