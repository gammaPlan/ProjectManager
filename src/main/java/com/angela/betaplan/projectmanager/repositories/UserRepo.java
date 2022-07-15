package com.angela.betaplan.projectmanager.repositories;

import java.util.List;
import java.util.Optional;

import com.angela.betaplan.projectmanager.models.Project;
import com.angela.betaplan.projectmanager.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findAll();
    Optional<User> findByEmail(String email);
    User findByIdIs(Long id);
    List<User> findAllByProjects(Project project);
    List<User> findByProjectsNotContains(Project project);
}
