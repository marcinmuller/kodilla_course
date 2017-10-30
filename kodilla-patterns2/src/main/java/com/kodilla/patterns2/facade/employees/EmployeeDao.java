package com.kodilla.patterns2.facade.employees;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Set;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    Set<Employee> retrieveName(@Param("LASTNAME") String lastname);

    @Query
    Set<Employee> retrieveSurname(@Param("LASTNAME") String lastname);

}
