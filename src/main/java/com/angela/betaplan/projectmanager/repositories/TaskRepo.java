package com.angela.betaplan.projectmanager.repositories;

import java.util.List;

import com.angela.betaplan.projectmanager.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepo extends CrudRepository<Task, Long> {
    List<Task> findAll();
    List<Task> findByProjectIdIs(Long id);
}
