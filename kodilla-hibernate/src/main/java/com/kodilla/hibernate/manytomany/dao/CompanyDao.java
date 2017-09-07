package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

/**
 * Created by Marcin Muller on 06.09.17.
 */
@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company,Integer> {

}
