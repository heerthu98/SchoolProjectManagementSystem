package com.example.projectmanagementsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectmanagementsystem.repository.ProjectRepository;
import com.example.projectmanagementsystem.domain.Project;


@Service
public class ProjectService {
    @Autowired
    private ProjectRepository repo;
    public List<Project> listAll() {
        return repo.findAll();
    }

    public void save(Project std) {
        repo.save(std);
    }

    public Project get(long projectid) {
        return repo.findById(projectid).get();
    }

    public void delete(long projectid) {
        repo.deleteById(projectid);
    }
}
