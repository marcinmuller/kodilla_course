package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marcin Muller on 05.09.17.
 */
@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList,Integer> {
    List<TaskList> findByListName(String listName);
}
