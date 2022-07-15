package com.angela.betaplan.projectmanager.services;

import com.angela.betaplan.projectmanager.models.Project;
import com.angela.betaplan.projectmanager.models.User;
import com.angela.betaplan.projectmanager.repositories.ProjectRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepo projectRepo;

    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public List<Project> allProjects(){
        return projectRepo.findAll();
    }

    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> getAssignedUsers(User user){
        return projectRepo.findAllByUsers(user);
    }

    public List<Project> getUnassignedUsers(User user){
        return projectRepo.findByUsersNotContains(user);
    }

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public void deleteProject(Project project) {
        projectRepo.delete(project);
    }

    public Project findById(Long id) {
        Optional<Project> optionalProject = projectRepo.findById(id);
        if(optionalProject.isPresent()) {
            return optionalProject.get();
        }else {
            return null;
        }
    }

}