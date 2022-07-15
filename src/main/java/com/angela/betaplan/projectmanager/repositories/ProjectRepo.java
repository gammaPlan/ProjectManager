package com.angela.betaplan.projectmanager.repositories;

import java.util.List;

import com.angela.betaplan.projectmanager.models.Project;
import com.angela.betaplan.projectmanager.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepo extends CrudRepository<Project, Long> {
    List<Project> findAll();
    Project findByIdIs(Long id);
    List<Project> findAllByUsers(User user);
    List<Project> findByUsersNotContains(User user);
}