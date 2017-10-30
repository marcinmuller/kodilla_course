package com.kodilla.patterns2.facade.employees;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * Created by Marcin Muller on 26.10.17.
 */
@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query
    Set<Company> retrieveName(@Param("LASTNAME") String lastname);
}
