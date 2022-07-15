package com.angela.betaplan.projectmanager.services;

import com.angela.betaplan.projectmanager.models.Task;
import com.angela.betaplan.projectmanager.repositories.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectTaskService {
    private final TaskRepo taskRepo;

    public ProjectTaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> allTasks(){
        return taskRepo.findAll();
    }

    public List<Task> projectTasks(Long projectId){
        return taskRepo.findByProjectIdIs(projectId);
    }

    public Task addTask(Task task) {
        return taskRepo.save(task);
    }

    public void deleteTask(Task task) {
        taskRepo.delete(task);
    }
}