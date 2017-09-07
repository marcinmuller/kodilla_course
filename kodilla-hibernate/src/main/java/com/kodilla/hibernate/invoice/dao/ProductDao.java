package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Marcin Muller on 06.09.17.
 */

@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product,Integer> {
}
